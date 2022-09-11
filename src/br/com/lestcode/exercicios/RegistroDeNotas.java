package br.com.lestcode.exercicios;

import java.util.*;

public class RegistroDeNotas {

    public static void main(String[] args) {

        double nota, media;
        double soma = 0;

        ArrayList<Double> listaNotas = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        int i = 1;
        System.out.println("REGISTRO DE NOTAS\n");

        while (i < 5) {
            System.out.println("Digite a nota do " + i + "º " + "Bimestre:");
            nota = scanner.nextDouble();
            if(nota > 10 || nota < 0) {
                System.out.println("Nota inválida");
            } else {
                listaNotas.add(nota);
                soma = soma + nota;
                i++;
            }

        }

        media = soma / listaNotas.size();
        System.out.println("Sua média é: "+ media);
    }
}
