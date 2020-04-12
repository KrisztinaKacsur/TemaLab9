package com.company;

public class Main {

    public static void main(String[] args) {
//Exercitiul 1: Salut + Nume

        String salut = "Hello";
	    String myName = "Krisztina";

            System.out.println(salut + "\n"+ myName);


//Exercitiul 2: Suma 2 numere la alegere


        long firstNumber = 1265956985;
        double secondNumber = 8.36;

        double result = firstNumber + secondNumber;

            System.out.println("Suma 2 numere:" + result);

//Exercitiul 3: impartire 2 numere

        long numberDevide1 = 3659859;
        short numberDevide2 = 3267;

        long result2 = numberDevide1 / numberDevide2;

            System.out.println("Impartire 2 numere:" + result2);

//Exercitiul 4/a:

        int number1 = -5;
        int number2 = 8;
        int number3 = 6;

        int result3 = number1 + number2 * number3;

            System.out.println("Ex 4a:" + result3);

//Exercitiul 4/b:

        byte number4 = 55;
        byte number5 = 9;
        byte number6 = 9;

        float result4 = (number4 + number5) % number6;

            System.out.println("Ex 4b:" + result4);

 //Exercitiul 4/c:

        byte number7 = 20;
        int number8 = -3;
        float number9 = 5;
        float number10 = 8;

        float result5 = number7 + (number8 * number9 / number10);

            System.out.println("Ex 4c:" + result5);


//Exercitiul 4/d

        int number11 = 5;
        int number12 = 15;
        int number13 = 3;
        int number14 = 2;
        int number15 = 8;
        int number16 = 3;

        int result6 = number11 + number12 / number13 * number14 - number15 % number16;

            System.out.println("Ex 4d:" + result6);


    }
}
