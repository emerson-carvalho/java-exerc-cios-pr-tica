package br.com.exercism.exercicios.geral;

import java.util.Arrays;

public class Matrix {

    String[] matrix;

    Matrix(String matrixAsString) {
        matrix = matrixAsString.split("\n");
    }

    int[] getRow(int rowNumber) {
        String[] linhas = matrix[rowNumber - 1].split(" ");
        return Arrays.stream(linhas).mapToInt(Integer::parseInt).toArray();
    }

    int[] getColumn(int columnNumber) {
        int length = matrix.length;
        int[] colunas = new int[length];

        for (int i = 0; i < length; i++){
            int[] row = getRow(i + 1);
            colunas[i] = row[columnNumber - 1];
        }
        return colunas;
    }

    public static void main(String[] args) {
        Matrix matrix = new Matrix("1 2 3\n4 5 6\n7 8 9\n8 7 6");
        System.out.println(Arrays.toString(matrix.getRow(4)));
        System.out.println(Arrays.toString(matrix.getColumn(3)));
    }
}