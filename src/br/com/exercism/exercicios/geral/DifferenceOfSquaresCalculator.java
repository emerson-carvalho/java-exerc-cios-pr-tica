package br.com.exercism.exercicios.geral;

public class DifferenceOfSquaresCalculator {

    int computeSquareOfSumTo(int input) {
        int soma = 0;
        for (int i = 1; i <= input; i++) {
            soma += i;
        }
        return (int) Math.pow(soma,2);
    }

    int computeSumOfSquaresTo(int input) {
        int soma = 0;
        for (int i = 1; i <= input; i++) {
            soma += Math.pow(i,2);
        }
        return soma;
    }

    int computeDifferenceOfSquares(int input) {
        return computeSquareOfSumTo(input) - computeSumOfSquaresTo(input);
    }
}
