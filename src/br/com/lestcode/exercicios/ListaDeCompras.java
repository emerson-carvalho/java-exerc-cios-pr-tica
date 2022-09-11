package br.com.lestcode.exercicios;

import java.util.Arrays;
import java.util.Scanner;

public class ListaDeCompras {

    public static void main(String[] args) {

        String[] carrinho = new String[5];

        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira sua lista de compras: ");

        for(int i = 0; i < carrinho.length; i++){
            carrinho[i] = scanner.nextLine();
        }

       /* System.out.println("As frutas no seu carrinho são: \n");
        for (String frutas : carrinho){
            System.out.print(frutas + ", ");
        } */
        System.out.println(Arrays.toString(carrinho));
    }
}