package br.com.lestcode.exercicios;

import java.util.Scanner;

public class Tabuada {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre com um numero de 1 a 10: ");
        int numero = scanner.nextInt();

        System.out.println("A Tabuada de " + numero + " é:");

        for (int i = 0; i <= 10; i++){
            int multiplicacao = numero * i;
            System.out.println(numero + " x " + i + " = " + multiplicacao);
        }
    }

}
