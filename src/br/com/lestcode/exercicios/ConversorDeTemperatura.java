package br.com.lestcode.exercicios;

import java.util.Scanner;

public class ConversorDeTemperatura {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println ("Entre com uma temperatura em Celsius para saber seu equivalente em Fahrenheit:");
        double tempC = scanner.nextDouble();
        double tempF = tempC * 9.0/5.0 + 32;

        System.out.println("O equivalente a " + tempC + "ºC" + " é " + tempF + "ºF.");
    }
}
