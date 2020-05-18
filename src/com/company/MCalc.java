package com.company;

public class MCalc {

    public static void main(String[] args) {

        Calculator calc = new Calculator();

        int sumInt = calc.sum(10,689);
        System.out.println("Sum for 2 int: " + sumInt);

        double sumDouble = calc.sum(69.789, 14.87);
        System.out.println("The som for 2 double: " + sumDouble);

        double sumIntDouble = calc.sum(361, 85.2);
        System.out.println("Sum int and double " + sumIntDouble);

        double sumDoubleInt = calc.sum (786.41, 64);
        System.out.println("Sum double and int " + sumDoubleInt);

        double sumIDD = calc.sum(6, 82.6, 647.8);
        System.out.println("Sum int double double: " + sumIDD);


        int subtractionInt = calc.subtraction(763, 84);
        System.out.println("Subtraction 2 int " + subtractionInt);

        double subtractionDouble = calc.subtraction(698.7, 721.78);
        System.out.println("Subtraction 2 double " + subtractionDouble);

        double subtractionDoubleInt = calc.subtraction(974.7,54);
        System.out.println("Subtraction double and int " + subtractionDoubleInt);

        double subtractionIntDouble = calc.subtraction(25, 11.8);
        System.out.println("Subtraction int and double " + subtractionIntDouble);

        double subtractionIDD = calc.subtraction(842, 32.7,97.31);
        System.out.println("Subtraction int double double " + subtractionIDD);

        int multiplyInt = calc.multiply(1254, 63);
        System.out.println("Multiply 2 int " + multiplyInt);

        double multiplyDouble = calc.multiply(72.6, 107.2);
        System.out.println("Multiply 2 double " + multiplyDouble);

        double multiplyIntDouble = calc.multiply(4, 98.4);
        System.out.println("Multiply int and double " + multiplyIntDouble);

        double multiplyDoubleInt = calc.multiply(41.8, 9);
        System.out.println("Multiply double and int " + multiplyDoubleInt);

        double multiplyIDD = calc.multiply(6, 98.7, 54.4);
        System.out.println("Multiply int double double " + multiplyIDD);


        double divideDouble = calc.divide(7.4,1.4);
        System.out.println("Divide 2 double: " + divideDouble);

        double divideIntDouble = calc.divide(14, 2.1);
        System.out.println("Divide int double " + divideIntDouble);

        int divideInt = calc.divide(10,2);
        System.out.println("Divide 2 int " + divideInt);

        double divideDDD = calc.divide(43.74, 51.6, 60.1);
        System.out.println("Divide 3 double " + divideDDD);



    }

}
