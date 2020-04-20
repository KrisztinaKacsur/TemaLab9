package com.company;

public class Lab10 {

    public static void main(String[] args) {

        System.out.println("Pe baza exercitiilor din Lab 9 \n");
        nameOne();
        two();
        three();
        fourA();
        fourB();
        fourC();
        fourD();

        System.out.println("\n");

        int sumMethod = sum(67,79);
        System.out.println("The result of the addition is: " + sumMethod);

        int decreaseMethod = decrease(46,24);
        System.out.println("The result of the subtraction is: " + decreaseMethod);

        int multiplyMethod = multiply(15,46);
        System.out.println("The result of the multiplication is: " + multiplyMethod);

        double divisionMethod = divide(36,7);
        System.out.println("The result of the division is: " + divisionMethod + "\n");

        patternJava();

        double averageMethod = average (72,42, 32);
        System.out.println("The result of the 3 numbers average is: " + averageMethod + "\n");


        pattern2();

        double restMethod = rest (31, 5.2);
        System.out.println("The rest of the division is: " + restMethod);

        double fahrenheitCelsiusMethod = fahrenheitCelsius (93);
        System.out.println("Fahrenheit to Celsius: " + fahrenheitCelsiusMethod);

        double inchMeterMethod = inchMeter(108);
        System.out.println("Inch to meter: " + inchMeterMethod + "\n");

        speed(10000,3,12,36);




    }

    //Lab 10/1

    public static void nameOne() {
        String myGreetingName = "Hello Krisztina :)";
        System.out.println(myGreetingName);
    }

    public static void two() {
        double result = 1265956985 + 8.36;
        System.out.println("Result ex 2: " + result);
    }

    public static void three() {
        int result = 3659859 - 3267;
        System.out.println("Result ex 3: " + result);
    }

    public static void fourA() {
        int result = 5 + 8 * 6;
        System.out.println("Result ex 4A: " + result);
    }

    public static void fourB () {
        double result = (55 + 90) % 9;
        System.out.println("Result ex 4B: " + result);
    }

    public static void fourC () {
        double result = 20.0 + (-3.0 * 5.0 / 8.0);
        System.out.println("Result ex 4C: " + result);
    }

    public static void fourD () {
        int result = 5 + 15 / 3 * 2 - 8 % 3;
        System.out.println("Result ex 4D: " + result);
    }

    //LAB 10/2

    public static int sum (int firstNumber , int secondNumber) {
        int result = firstNumber + secondNumber;
        return result;
    }

    public static int decrease (int firstNumber, int secondNumber) {
        int result = firstNumber - secondNumber;
        return result;
    }

    public static int multiply (int firstNumber, int secondNumber) {
        int result = firstNumber * secondNumber;
        return result;
    }

    public static double divide (double firstNumber, double secondNumber) {
        double result = firstNumber / secondNumber;
        return result;
    }

    //Lab 10/3 JAVA
    public static void patternJava () {
        String myPattern = "   J        a       v           v       a\n" +
                           "   J      a   a       v       v       a   a\n" +
                           "J  J    a a a a a       v   v       a a a a a\n" +
                           " JJ   a           a       v       a           a\n";

        System.out.println(myPattern);
    }

    //Lab 10/4

    public static double average (double firstNumber, double secondNumber, double thirdNumber) {
        double result = firstNumber + secondNumber + thirdNumber;
        double result2 = result / 3;
        return result2;
    }

    //Lab 10/5    omulet
    public static void pattern2 () {
        String firstLine =  "  + \" \" \" \" \" +\n";
        String secondLine = " [|   o   o   |]\n";
        String thirdLine =  "  |     ^     |\n";
        String fourthLine = "  |   ' _ '   |\n";
        String fifthLine =  "  + _ _ _ _ _ +\n";


        String complete = firstLine + secondLine + thirdLine + fourthLine + fifthLine;

        System.out.println(complete);


    }


    //Lab 10/6

    public static double rest (double firstNumber, double secondNumber) {
        double result = firstNumber % secondNumber;
        return result;
    }


    // Lab 10/7           C = 5/9 * (F -32)
    public static double fahrenheitCelsius (double fahrenheit) {
        double resultCelsius = 5.0 / 9.0 * (fahrenheit - 32.0);
        return resultCelsius;
    }

    //Lab 10/8           39.37  inch to m
    public static double inchMeter (double inch) {
        double resultMeter = inch / 39.37;
        return resultMeter;
    }

    //Lab 10/9 in distanta: metri & timpul: ore, minute, secunde; out viteza m/sec, km/h , mile/h ( 1 mila = 1609 metrii)

    public static void speed (double distance, int hours, int minutes, int seconds) {


        int hoursInSeconds = hours * 3600;
        //System.out.println("Hours in seconds: " + hoursInSeconds);

        int minutesInSeconds = minutes * 60;
        //System.out.println("Minutes in seconds: " + minutesInSeconds);

        int time = hoursInSeconds + minutesInSeconds + seconds;
        //System.out.println("Timpul total in secunde: " + time);

        // m/s
        double speedMS = distance / time;
        System.out.println("m/s: " + speedMS);

        // km/h
        double speedKmH = speedMS * 3.6;
        System.out.println("km/h " + speedKmH);

        // mile/h
        double speedMileH = speedKmH / 1.609344;
        System.out.println("miles/h: " + speedMileH);

    }




    }




