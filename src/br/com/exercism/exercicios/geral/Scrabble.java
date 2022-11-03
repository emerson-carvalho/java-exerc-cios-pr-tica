package br.com.exercism.exercicios.geral;

import java.util.ArrayList;
import java.util.List;

public class Scrabble {

    private List<Character> caracteres = new ArrayList<>();

    Scrabble(String word) {
        for (int i = 0; i < word.length(); i++){
           this.caracteres.add(word.toUpperCase().charAt(i));
        }
    }

    int getScore() {
        int score = 0;

        for (Character ch: caracteres){
            switch (ch){
                case 'A', 'E', 'I', 'O', 'U', 'L', 'N', 'R', 'S', 'T' ->  score += 1;
                case 'D', 'G' ->  score += 2;
                case 'B','C', 'M','P' ->  score +=3;
                case 'F', 'H', 'V', 'W', 'Y' ->  score += 4;
                case 'K' -> score += 5;
                case 'J', 'X' ->  score += 8;
                case 'Q', 'Z'->  score += 10;
            }
        }
        return score;
    }

    public static void main(String[] args) {

        Scrabble s = new Scrabble("cabbage");
        System.out.println(s.getScore());
    }
}
