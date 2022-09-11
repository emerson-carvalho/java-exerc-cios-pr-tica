package br.com.lestcode.exercicios;

import java.util.Scanner;

public class DecomposicaoNumeros {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o valor a ser decomposto:");
        double valor = entrada.nextDouble();

        int notas[] = {100, 50, 20, 10, 5, 2};
        double moedas[] = {1, 0.5, 0.25, 0.10, 0.05, 0.01};

        if (valor > 0) {
            System.out.println("\nNOTAS:");
            for (int cedula : notas) {
                int quantidadeDeCedulas = (int) (valor / cedula);
                valor = valor - quantidadeDeCedulas * cedula;
                System.out.println(quantidadeDeCedulas + " nota(s) de " + cedula);
            }

            System.out.println("\nMOEDAS:");
            for (double moeda : moedas) {
                int quantidadeDeMoedas = (int) (valor / moeda);
                valor = valor - quantidadeDeMoedas * moeda;
                System.out.println(quantidadeDeMoedas + " moeda(s) de " + moeda);
            }
        }
    }
}
