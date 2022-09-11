package br.com.lestcode.exercicios;

import java.util.Scanner;

public class FrutasEmPromocao {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] frutasPromocao = {"Banana", "Maçã", "Abacaxi", "Melão", "Mamão"};

        System.out.println("Qual fruta você deseja comprar hoje?");
        String fruta = scanner.nextLine();


        for (String frutas:frutasPromocao){
            if(frutas.equalsIgnoreCase(fruta)){
                System.out.println("Ótima escolha! Essa fruta está em promoção hoje.");
                break;
            }
        }
    }
}