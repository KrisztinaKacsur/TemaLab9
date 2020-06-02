package com.company;

import java.util.Arrays;

public class Lab13 {


    public static void main(String[] args) {

        LogicalOp logical = new LogicalOp();

        System.out.println("Array 1-100:");

        int[] myArray = logical.getArrayHundred();
        logical.printArray(myArray);

        System.out.println("\n");

        System.out.println("Even numbers from 1 to 100 array:");
        int[] arrayEven = new int[100];
        logical.evenNumbersArray(arrayEven);

        System.out.println("\n");

        System.out.println(logical.averageArray(myArray));

        System.out.println("\n");

        System.out.println(logical.returnStringArray(new String[] {"apple", "water" , "2647rcbs" } , "k"));

        System.out.println("\n");

        System.out.println(logical.checkPosition(new int[]{6, 103, 126, 34, 24}, 34));

        System.out.println("\n");

        logical.linePattern();

        System.out.println("\n");

        int[] fullArray = new int[12];
        logical.removeNrFromArray(fullArray, 9);
        System.out.println(Arrays.toString(fullArray));



        System.out.println("\n");

        System.out.println(logical.returnSecondSmallest(new int [] {124, 63, 8, 9, 12}));

        System.out.println("\n");

        int [] populatedArray = {9, 72, 136, 98, 4};
        int [] emptyArray = new int[populatedArray.length];
        logical.copyArray(populatedArray, emptyArray);
        logical.printArray(emptyArray);

        System.out.println("\n");


        //--------------- Tema Optionala LAB 13 -----------------------
        System.out.println("Tema optionala Arrays");

        System.out.println("\n");

        int [] minMaxArray = {6, 86, 4, 74, 12, 200, 36};
        logical.minMax(minMaxArray);

        System.out.println("\n");

        int [] reverse = {7,8,9,10,11};
        logical.reverseArray(reverse);

        System.out.println("\n");

        int[] withDuplicates = {1,2,3,6,3,2,9,8};
        logical.duplicated(withDuplicates);

        System.out.println("\n");

        String[] first = {"apple" , "car", "coffee" , "cat" , "cherry"};
        String[] second = {"apple", "cherry" , "grapes"};
        logical.similarValues(first, second);

        System.out.println("\n");

        System.out.println("Organized array: " + Arrays.toString(logical.returnAscending(new int[]{1, 700, 6, 23, 11, 19, 74})));

















    }
}
