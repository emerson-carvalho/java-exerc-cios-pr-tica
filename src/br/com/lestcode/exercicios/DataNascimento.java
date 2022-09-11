package br.com.lestcode.exercicios;

import java.sql.SQLOutput;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Scanner;

public class DataNascimento {

    public static void main(String[] args) throws ParseException {

        System.out.println("Entre com a sua data de nascimento:");

        Scanner sc = new Scanner(System.in);
        String data = sc.nextLine();

        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Date dataFormatada = formato.parse(data);

        System.out.println(dataFormatada.getYear());

    }
}
