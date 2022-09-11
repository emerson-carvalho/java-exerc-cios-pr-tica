package br.com.lestcode.exercicios;

import java.util.Random;
import java.util.Scanner;

public class JogoPedraPapelTesoura {

    public static void main(String[] args) {


        System.out.println("\n***--------**--------**-------- BEM VINDO AO JOGO --------**--------**--------***");

        System.out.println("Estas são as opções:\n1-PEDRA\n2-PAPEL\n3-TESOURA\n");

        int jogadorAPontos = 0;
        int jogadorBPontos = 0;
        int rodadas = 1;

        Scanner entrada = new Scanner(System.in);
        Random random = new Random();

        while (rodadas < 4) {

            System.out.println("Jogador, faça sua jogada.");
            int a = entrada.nextInt();

            if (a >= 1 && a <= 3) {

                System.out.println("O computador agora vai fazer sua jogada.");
                int b= ((random.nextInt(3)) + 1);
                System.out.println(b);

                if (a == b) {
                    System.out.println("Empate!\n");
                } else if ((a == 1 && b == 3) || (a == 2 && b == 1) || (a == 3 && b == 2)) {
                    System.out.println("\n*** Jogador A venceu essa rodada!! ***\n");
                    jogadorAPontos++;
                } else {
                    System.out.println("\n*** O computador venceu essa rodada ***!!\n");
                    jogadorBPontos++;
                }
                rodadas++;
            } else {
                System.out.println("Opção Inválida\n");
            }
        }
        if (jogadorAPontos == jogadorBPontos){
            System.out.println("[ HOUVE UM EMPATE! ]");
        } else if (jogadorAPontos > jogadorBPontos) {
            System.out.println("\n[ JOGADOR A VENCEU A PARTIDA!! ]");
        }  else {
            System.out.println("\n[ O COMPUTADOR VENCEU A PARTIDA!! ]");
        }
    }
}
