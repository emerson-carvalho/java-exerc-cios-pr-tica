package br.com.lestcode.exercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DesafioMelhorado {

    public static void main(String[] args) {

        double acertos = 0;
        double gorjeta;
        String frutaEntregue;
        String frutaDesejada;
        boolean finalizarListaDesejada = false;
        boolean finalizarListaEntregue = false;

        List<String> listaDesejada = new ArrayList<>();
        List<String> listaComprada = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem vindo! Digite as frutas desejadas por você.\nQuando quiser finalizar, digite 0.");

        while (!finalizarListaDesejada) {

            frutaDesejada = scanner.nextLine();

            if (frutaDesejada.equals("0")) {
                finalizarListaDesejada = true;
            } else {
                listaDesejada.add(frutaDesejada);
            }
        }

        System.out.println("\nDigite as frutas foram entregues a você:");
        while (!finalizarListaEntregue) {

            frutaEntregue = scanner.nextLine();

            if (frutaEntregue.equals("0")){
                finalizarListaEntregue = true;
            } else {
                listaComprada.add(frutaEntregue);
            }
        }

        for (String frutasDesejadas : listaDesejada){
            for (String frutasCompradas : listaComprada){
                if (frutasDesejadas.equals(frutasCompradas)){
                    acertos++;
                }
            }
        }

        double acertosPorcentagem = (acertos/listaDesejada.size()) * 100;

        if(acertosPorcentagem >= 90){
            gorjeta = 10;
        } else if (acertosPorcentagem >= 75) {
            gorjeta = 5;
        } else if (acertosPorcentagem >= 50) {
            gorjeta = 3;
        } else {
            gorjeta = 0;
        }

        System.out.println("\nCorrespondência de " + acertosPorcentagem + "%. Gorjeta de R$ " + gorjeta);
    }
}