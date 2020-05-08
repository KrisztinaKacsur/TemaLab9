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

        String andConditionMethod = logical.returnTextNumber(" kecsT " , 8);
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
        System.out.println(returnBiggestNumber + "\n");


        System.out.println("Tema Laborator 12: \n");

        logical.upToOneHundred(6);
        System.out.println("\n");

        logical.negativeUpToOneHundred(60);
        System.out.println("\n");

        logical.countingBetweenTwoNumbers(2,8);
        System.out.println("\n");

        logical.verifyAndCount(5,2);
        System.out.println("\n");

        logical.evenNumbers();
        System.out.println("\n");

        logical.oddNumbers();
        System.out.println("\n");

        int addUp = logical.addingUp(50);
        System.out.println("Sum of given number up to 100: " +addUp + "\n");

        double average = logical.getAverage(1);

        float averageWhile = logical.sumAverageWhile();
        System.out.println(averageWhile);

        logical.stars();

        logical.countToHundredWhile(89);
        System.out.println("\n");

        logical.countBackwardsWhile(-90);
        System.out.println("\n");

        logical.countBetweenWhile(5,9);
        System.out.println("\n");

        logical.countFromSmallToBigWhile(70,63);
        System.out.println("\n");

        logical.evenNumbersWhile();
        System.out.println("\n");

        logical.oddNumberWhile();
        System.out.println("\n");

        logical.sumAndAverageWhile();
        System.out.println("\n");

        float divide = logical.divideBySevenWhile(1,70);
        System.out.println(divide + "\n");

        logical.fibonacci();

        logical.cozaLozaWoza();















    }


}
