package br.com.lestcode.exercicios;

import java.util.ArrayList;

public class Desafio {

    public static void main(String[] args) {

        double acertos = 0;
        double gorjeta = 0;

        String[] listaDesejada = {"Banana", "Maçã", "Abacaxi", "Melão", "Mamão"};
        String[] listaComprada = {"Mamão","Banana", "Melão"};

        //50 a 74 = 3 ,, 75 a 89 = 5,, 90 acima = 10

        for (int i = 0; i < listaDesejada.length; i++){
            for (int j = 0; j < listaComprada.length; j ++){
                if (listaDesejada[i].equalsIgnoreCase(listaComprada[j])){
                    acertos++;
                }
            }
        }

        double acertosPorcentagem = (acertos/listaDesejada.length) * 100;

        if(acertosPorcentagem >= 50 && acertosPorcentagem < 75){
            gorjeta = 3;
        } else if (acertosPorcentagem >= 75 && acertosPorcentagem <90) {
            gorjeta = 5;
        } else if (acertosPorcentagem >=90) {
            gorjeta = 10;
        } else {
            gorjeta = 0;
        }

        System.out.println("Correspondência de " + acertosPorcentagem + "%. Gorjeta de R$ " + gorjeta);
    }
}

