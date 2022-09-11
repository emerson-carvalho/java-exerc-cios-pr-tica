package br.com.lestcode.exercicios;

import java.util.Scanner;

public class ConsultaDDD {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o DDD que você quer pesquisar: ");
        int ddd = scanner.nextInt();

        String cidade = switch (ddd) {
            case 61 -> "Brasilia";
            case 71 -> "Salvador";
            case 11 -> "São Paulo";
            case 21 -> "Rio de Janeiro";
            case 32 -> "Juiz de Fora";
            case 19 -> "Campinas";
            case 27 -> "Vitória";
            case 31 -> "Belo Horizonte";
            default -> "Null. Não encontrada";
        };

        System.out.println("O DDD " + ddd + " pertece à cidade: " + cidade);
    }
}