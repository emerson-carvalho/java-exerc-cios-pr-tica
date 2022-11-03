package br.com.exercism.exercicios.triangle;

public class Triangle {
    double side1, side2, side3;

    Triangle(double side1, double side2, double side3) throws TriangleException {
        if (isTriangle(side1, side2, side3)) {
            this.side1 = side1;
            this.side2 = side2;
            this.side3 = side3;
        } else
            throw new TriangleException();
    }

    boolean isEquilateral() {
        return side1 == side2 && side2 == side3;
    }

    boolean isIsosceles() {
        return (side1 == side2 | side2 == side3 | side3 == side1);
    }

    boolean isScalene() {
        return !isEquilateral() && !isIsosceles();
    }

    boolean isTriangle(double side1, double side2, double side3) {
        return (side1 > 0 && side2 > 0 && side3 > 0) &&
                ((side1 + side2 >= side3) && (side1 + side3 >= side2) && (side2 + side3 >= side1));
    }
}

