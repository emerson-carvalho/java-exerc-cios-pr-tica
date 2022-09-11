package br.com.lestcode.exercicios;

import java.util.Scanner;

public class Loja {

    public static void main(String[] args) {

        int desconto = 0;

        Scanner scanner = new Scanner(System.in);

        String[] frutasPromocao = {"Banana", "Maçã", "Abacaxi", "Melão", "Mamão"};
        String[] listaCompras = new String[4];

        System.out.println("Quais fruta você deseja comprar hoje?");
        for (int i = 0; i < listaCompras.length; i++){
            listaCompras[i] = scanner.nextLine();
        }

        for (String frutaPromocao:frutasPromocao){
            for(String frutasDaLista:listaCompras) {
                if (frutaPromocao.equalsIgnoreCase(frutasDaLista)) {
                    desconto+= 5;
                }
            }
        }

        System.out.println("Você tem direito a um desconto de "+ desconto + "%.");

    }
}

