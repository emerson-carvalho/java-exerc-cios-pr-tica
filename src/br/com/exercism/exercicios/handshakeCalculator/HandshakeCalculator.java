package br.com.exercism.exercicios.handshakeCalculator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HandshakeCalculator {

    public static List<Signal> calculateHandshake(int number) {
        List<Signal> list = new ArrayList<>();
        String binary = Integer.toBinaryString(number);

        int arraySize = binary.length();

        if (binary.length() >= 4 && (binary.charAt(arraySize - 4) == '1')) {
            list.add(0, Signal.JUMP);
        }
        if (binary.length() >= 3 && (binary.charAt(arraySize - 3) == '1')) {
            list.add(0, Signal.CLOSE_YOUR_EYES);
        }
        if (binary.length() >= 2 && (binary.charAt(arraySize - 2) == '1')) {
            list.add(0, Signal.DOUBLE_BLINK);
        }
        if (binary.charAt(arraySize - 1) == '1') {
            list.add(0, Signal.WINK);
        }

        if (arraySize >= 5 && (binary.charAt(arraySize - 5) == '1')) {
            Collections.reverse(list);
        }

        return list;
    }

    public static void main(String[] args) {
        String binary = Integer.toBinaryString(51);
        System.out.println(binary);
        System.out.println(calculateHandshake(51));

    }
}

