package com.company;

import java.util.stream.IntStream;

public class LogicalOp {


    //ex 3
    public int checkBiggerNumber(int smallerNumber, int biggerNumber) {
        if (smallerNumber < biggerNumber) {
            return biggerNumber;
        } else {
            return smallerNumber;
        }
    }


    //ex4
    public String checkText(String text) {
        if (text.equals("FastTrackIT")) {
            return "Learning text comparision.";
        } else {
            return "Got to try some more.";
        }
    }
//==

    //ex5
    public String returnTextNumber (String text, int number) {
        if (text.equals("FastTrackIT ") && number <= 3) {
            return text + number;
        } else if (!text.equals("FastTrackIT ") && number <= 4) {
            return number + text;
        } else {
            return "Neither conditions are true";
        }
    }


    public String orCondition(int number) {
        if (number > 8 || number == 6) {
            return "The amount of snow this winter was(cm): " + number;
        } else {
            return "The forecast snow is(cm): " + number;
        }

    }

    //ex 7
    public String greaterThanEqualTo (int number) {
        if ( number > 3 && number != 4) {
            return "The number is greater than 3 and not equal to 4";
        } else if (number == 4) {
            return "The number is equal to 4";
        } else if (number < 3); {
            return "The number is lower than 3";
        }
    }

    //ex 8
    public void printNumber (int number) {
        switch (number) {
            case 0:
                System.out.println("The number os 0");
                break;
            case 1:
                System.out.println("The number is 1");
                break;
            case 2:
                System.out.println("The number is 2");
                break;
            case 3:
                System.out.println("The number is 3");
                break;
            case 4:
                System.out.println("The number is 4");
                break;
            case 5:
                System.out.println("The number is 5");
                break;
            case 6:
                System.out.println("The number is 6");
                break;
            case 7:
                System.out.println("The number is 7");
                break;
            case 8:
                System.out.println("The number is 8");
                break;
            case 9:
                System.out.println("The number is 9");
                break;
            default:
                System.out.println("Not allowed");
        }
    }



    //ex 9

    public boolean isNumberEven (int number) {
        if (number % 2 == 0){
            return true;
        } else {
            return false;
        }
    }

    //10
    public boolean isEligibleToVote (int number) {
        if (number >= 18) {
            return true;
        } else {
            return false;
        }
    }

    //ex 11
    public String returnBiggestNumber (int firstNumber, int secondNumber, int thirdNumber){
        if (firstNumber >= secondNumber && firstNumber >= thirdNumber) {
            return "The largest number is: " + firstNumber;
        } else if (secondNumber >= firstNumber && secondNumber >= thirdNumber) {
            return "The biggest number is: " + secondNumber;
        } else {
            return "The biggest number is: " + thirdNumber;
        }

    }



    //LAB 12/ex 1
    public void upToOneHundred (int givenNumber) {
        System.out.println("Count from given number up to 100: ");
       for (int i = givenNumber; i <= 100; i++ ){
           System.out.println(i);
       }
    }


    //LAB 12/ex 2
    public void negativeUpToOneHundred (int givenNumber){
        System.out.println("Count from given number up to -100: ");
        for (int i = givenNumber; i <=100; i++){
            System.out.println(-i);
        }
    }


    //LAB 12/ ex 3
    public void countingBetweenTwoNumbers (int firstNumber, int secondNumber) {
        System.out.println("Count between 2 given numbers: ");
       for (int i = firstNumber; i <= secondNumber; i++) {
           System.out.println(i);
       }
    }

    //LAB 12/ex 4
    public void verifyAndCount (int firstNumber, int secondNumber) {
        System.out.println("Verify smaller number and count: ");
        int smallerNumber = Math.min(firstNumber, secondNumber);
        int biggerNumber = Math.max(firstNumber, secondNumber);

        for (int i = smallerNumber; i <= biggerNumber; i++){
            System.out.println(i);
        }
    }


    //LAB 12/ex 5
    public void evenNumbers () {
        System.out.println("Print even numbers between 1 and 100: ");
        int endCounting = 100;

        for (int i = 1; i <= endCounting; i++) {
            if (i % 2 == 0){
                System.out.println(i);
            }
        }
    }


    //LAB 12/ex 6
    public void oddNumbers () {
        System.out.println("Print odd numbers between 1 and 100: ");
        int endCounting = 100;

        for (int i = 1; i <= endCounting; i++) {
            if (i % 2 != 0){
                System.out.println(i);
            }
        }
    }

    //Lab 12/ex 7
    public int addingUp (int givenNumber){
        int sum = 0;
        for (int i = givenNumber; i <= 100; i++){
            sum += i;
        }
        return sum;
    }

    //Lab 12/ ex 8

    public double average (double givenNumber) {
        double sum = 0;
        double length = 100 - givenNumber + 1;

        for (double i = givenNumber; i <= 100; i++){
            sum += i;
        }
        return sum/length;
    }


    //Lab 12/ ex 9
    public void stars () {
        System.out.println("Star pattern \n");
        int rows;
        int columns;

        for (rows = 7; rows >= 1; rows-- ){
            for (columns = 1; columns <= rows; columns++){
                System.out.print("*");
            }
            System.out.println();
        }
    }


}