package br.com.lestcode.exercicios;

import java.util.Scanner;

public class CorrigeTelefone {

    public static void main(String[] args) {

        String telefone = null;
        Scanner entrada = new Scanner(System.in);
        boolean validado = false;

        System.out.println("*--------------------VALIDADOR DE NÚMERO TELEFÔNICO------------------------*\n");
        
        while (!validado){

            System.out.println("Digite o número de telefone a ser validado:");
            telefone = entrada.nextLine();

            if (telefone.length() > 10 || telefone.length() < 8){
                System.out.println("Quantidade de números inválido. Digite entre 8 e 9 caracteres!");
            } else if (telefone.startsWith("9")){
                validado = true;
            } else {
                telefone = "9" + telefone;
                validado = true;
            }
        }

        System.out.println("\nSeu número de telefone é: " + telefone);

    }
}
