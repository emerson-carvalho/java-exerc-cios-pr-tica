package br.com.exercism.exercicios.geral;

public class Hamming {

    private int distancia;
    private String dna1;
    private String dna2;

    public Hamming(String leftStrand, String rightStrand) throws IllegalArgumentException {

        if (leftStrand.isEmpty() && rightStrand.length() != 0){
            throw new IllegalArgumentException ("left strand must not be empty.");
        } else if (rightStrand.isEmpty() && leftStrand.length() != 0) {
            throw new IllegalArgumentException ("right strand must not be empty.");
        } else if (leftStrand.length() != rightStrand.length()) {
            throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");
        }
        this.dna1 = leftStrand;
        this.dna2 = rightStrand;
    }

    public int getHammingDistance() {
        for (int i = 0; i < dna1.length(); i++) {
            if (dna1.charAt(i) != dna2.charAt(i)) {
                distancia++;
            }
        }
       return distancia;
    }

    public static void main(String[] args) throws Exception {
        Hamming a = new Hamming("CATCGTAATGACGGA","CATCGTAATGCGGCC");
        System.out.println(a.getHammingDistance());
        }
}

