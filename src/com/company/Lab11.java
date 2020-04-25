package com.company;

public class Lab11 {
    public static void main(String[] args) {

        Calculator calc = new Calculator();

        int sumMethod = calc.sum(31,92);
        System.out.println("The result of the addition is: " + sumMethod);

        int decreaseMethod = calc.decrease(87,64);
        System.out.println("The result of the subtraction is: " + decreaseMethod);

        int multiplyMethod = calc.multiply(7,87);
        System.out.println("The result of the multiplication is: " + multiplyMethod);

        double divisionMethod = calc.divide(39,6);
        System.out.println("The result of the division is: " + divisionMethod + "\n");


        LogicalOp logical = new LogicalOp();
        int biggest = logical.checkBiggerNumber(4,19);
        System.out.println("The bigger number is: " + biggest);

        String textVerify = logical.checkText("FastTrackIT");
        System.out.println(textVerify);

        String andConditionMethod = logical.returnTextNumber(" FastTrackIT " , 3);
        System.out.println(andConditionMethod);

        String orConditionMethod = logical.orCondition(9);
        System.out.println(orConditionMethod);

        String greaterEqual = logical.greaterThanEqualTo(5);
        System.out.println(greaterEqual);

//ex 8
        logical.printNumber(7);

        boolean isNumberEvenMethod = logical.isNumberEven(8);
        System.out.println(isNumberEvenMethod);

        boolean isEligibleToVoteMethod = logical.isEligibleToVote(19);
        System.out.println(isEligibleToVoteMethod);

        String returnBiggestNumber = logical.returnBiggestNumber(67, 14, 2);
        System.out.println(returnBiggestNumber);


    }


}
