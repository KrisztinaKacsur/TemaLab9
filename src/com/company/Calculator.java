package com.company;

public class Calculator {

    public int sum (int firstNumber , int secondNumber) {
        int result = firstNumber + secondNumber;
        return result;
    }

    public int decrease (int firstNumber, int secondNumber) {
        int result = firstNumber - secondNumber;
        return result;
    }

    public int multiply (int firstNumber, int secondNumber) {
        int result = firstNumber * secondNumber;
        return result;
    }

    public double divide (double firstNumber, double secondNumber) {
        double result = firstNumber / secondNumber;
        return result;
    }
}
