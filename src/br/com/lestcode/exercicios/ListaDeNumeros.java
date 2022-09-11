package br.com.lestcode.exercicios;

import java.util.ArrayList;
import java.util.Random;

public class ListaDeNumeros {

    public static void main(String[] args) {

        int num;
        int maior, menor, soma = 0;
        double media;

        ArrayList<Integer> listaDeNumeros = new ArrayList<>();

        Random numAleatorio = new Random();

        while (listaDeNumeros.size() < 10) {
            num = numAleatorio.nextInt(98) + 1;
            if (!listaDeNumeros.contains(num)) {
                listaDeNumeros.add(num);
            }
        }

        int tamLista = listaDeNumeros.size();
        maior = listaDeNumeros.get(0);
        menor = listaDeNumeros.get(0);

        for (int numero : listaDeNumeros) {
            if (numero > maior) {
                maior = numero;
            } else if (numero < menor) {
                menor = numero;
            }
            soma = soma + numero;
        }

        media = (double) soma / tamLista;

        System.out.println(listaDeNumeros);
        System.out.println("O maior número é " + maior);
        System.out.println("O menor número é " + menor);
        System.out.println("A média é " + media);
        System.out.println("A soma é " + soma);

    }

}