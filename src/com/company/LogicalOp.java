package com.company;

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



}