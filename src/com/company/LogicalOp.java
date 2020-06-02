package com.company;

import java.util.*;

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
    public String returnTextNumber(String text, int number) {
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
    public String greaterThanEqualTo(int number) {
        if (number > 3 && number != 4) {
            return "The number is greater than 3 and not equal to 4";
        } else if (number == 4) {
            return "The number is equal to 4";
        } else if (number < 3) ;
        {
            return "The number is lower than 3";
        }
    }

    //ex 8
    public void printNumber(int number) {
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

    public boolean isNumberEven(int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    //10
    public boolean isEligibleToVote(int number) {
        if (number >= 18) {
            return true;
        } else {
            return false;
        }
    }

    //ex 11
    public String returnBiggestNumber(int firstNumber, int secondNumber, int thirdNumber) {
        if (firstNumber >= secondNumber && firstNumber >= thirdNumber) {
            return "The largest number is: " + firstNumber;
        } else if (secondNumber >= firstNumber && secondNumber >= thirdNumber) {
            return "The biggest number is: " + secondNumber;
        } else {
            return "The biggest number is: " + thirdNumber;
        }

    }


    //LAB 12/ex 1
    public void upToOneHundred(int givenNumber) {
        System.out.println("Count from given number up to 100: ");
        for (int i = givenNumber; i <= 100; i++) {
            System.out.println(i);
        }
    }


    //LAB 12/ex 2
    public void negativeUpToOneHundred(int givenNumber) {
        System.out.println("Count from given number up to -100: ");
        for (int i = givenNumber; i <= 100; i++) {
            System.out.println(-i);
        }
    }


    //LAB 12/ ex 3
    public void countingBetweenTwoNumbers(int firstNumber, int secondNumber) {
        System.out.println("Count between 2 given numbers: ");
        for (int i = firstNumber; i <= secondNumber; i++) {
            System.out.println(i);
        }
    }

    //LAB 12/ex 4
    public void verifyAndCount(int firstNumber, int secondNumber) {
        System.out.println("Verify smaller number and count: ");
        int smallerNumber = Math.min(firstNumber, secondNumber);
        int biggerNumber = Math.max(firstNumber, secondNumber);

        for (int i = smallerNumber; i <= biggerNumber; i++) {
            System.out.println(i);
        }
    }


    //LAB 12/ex 5
    public void evenNumbers() {
        System.out.println("Print even numbers between 1 and 100: ");
        int endCounting = 100;

        for (int i = 1; i <= endCounting; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }


    //LAB 12/ex 6
    public void oddNumbers() {
        System.out.println("Print odd numbers between 1 and 100: ");
        int endCounting = 100;

        for (int i = 1; i <= endCounting; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }

    //Lab 12/ex 7
    public int addingUp(int givenNumber) {
        int sum = 0;
        for (int i = givenNumber; i <= 100; i++) {
            sum += i;
        }
        return sum;
    }

    //Lab 12/ ex 8

    public float getAverage(int givenNumber) {
        float sum = 0;

        for (float i = givenNumber; i <= 100; i++) {
            sum += i;
        }
        float average = sum / 100F;
        System.out.println(sum);
        System.out.println(average);
        return (average);
    }


    //Lab 12/ ex 9
    public void stars() {
        System.out.println("Star pattern \n");
        int rows;
        int columns;

        for (rows = 7; rows >= 1; rows--) {
            for (columns = 1; columns <= rows; columns++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }


    //Lab 12/exemplu

    public float sumAverageWhile() {
        int number = 1;
        int sum = 0;

        while (number <= 100) {
            sum += number;
            number++;
        }
        return sum / 100F;
    }


    //Lab 12 / ex 1

    public void countToHundredWhile(int givenNumber) {
        System.out.println("Count forward: ");

        while (givenNumber <= 100) {
            System.out.println(givenNumber);
            givenNumber++;
        }

    }

    //Lab 12 / ex 2

    public void countBackwardsWhile(int givenNumber) {
        System.out.println("Count backwards: ");

        while (givenNumber >= -100) {
            System.out.println(givenNumber);
            givenNumber--;
        }

    }

    //Lab 12/ ex 3
    public void countBetweenWhile(int firstNumber, int secondNumber) {
        System.out.println("Count between two numbers: ");

        while (firstNumber <= secondNumber) {
            System.out.println(firstNumber);
            firstNumber++;
        }
    }

    //Lab 12 / ex 4
    public void countFromSmallToBigWhile(int firstNumber, int secondNumber) {
        System.out.println("Choose smaller number & count to bigger: ");

        int smallerNumber = Math.min(firstNumber, secondNumber);
        int biggerNumber = Math.max(firstNumber, secondNumber);

        while (smallerNumber <= biggerNumber) {
            System.out.println(smallerNumber);
            smallerNumber++;
        }

    }

    //Lab 12 / ex 5
    public void evenNumbersWhile() {

        System.out.println("Even numbers between 1 and 100: ");

        int firstNumber = 1;

        while (firstNumber <= 100) {
            firstNumber++;

            if (firstNumber % 2 == 0) {
                System.out.println(firstNumber);
            }
        }
    }


    // Lab 12 / ex 6
    public void oddNumberWhile() {
        System.out.println("Odd numbers between 1 and 100: ");

        int countFrom = 0;
        int endCount = 100;

        while (countFrom < endCount) {
            countFrom++;

            if (countFrom % 2 != 0) {
                System.out.println(countFrom);
            }
        }
    }


    //Lab 12 / ex 7
    public void sumAndAverageWhile() {
        int firstNumber = 111;
        int secondNumber = 8899;

        double sum = 111;

        int count = 8899 - 111 + 1;

        while (firstNumber <= secondNumber) {
            sum += firstNumber;
            firstNumber++;

        }

        System.out.println(sum);
        System.out.println("Numbers between 111 - 8899: " + count);
        double average = sum / count;
        System.out.println("The average of the numbers is: " + average);

    }

    //Lab 12 / ex 8
    public float divideBySevenWhile(int firstNumber, int lastNumber) {

        float count = 0F;
        float sum = 0F;


        while (firstNumber <= lastNumber) {
            if (firstNumber % 7 == 0) {
                count += 1;
                sum += firstNumber;
            }
            firstNumber++;
        }

        float average = sum / count;
        return average;


    }

    //Lab 12 / ex 9
    public void fibonacci() {
        System.out.println("First 20 Fibonacci numbers: ");

        int firstNumber = 0;
        int secondNumber = 1;
        int endCount = 20;
        int count = 1;

        while (count <= endCount) {
            int sum = firstNumber + secondNumber;
            firstNumber = secondNumber;
            secondNumber = sum;
            System.out.println(sum);
            count++;
        }
        System.out.println("\n");
    }

    //Lab 12/ ex 10
     public void cozaLozaWoza() {
        int startFrom = 1;
        int endAt = 110;

        while (startFrom <= endAt) {
            if (startFrom % 11 == 0) {
                System.out.println(startFrom + "\n");
            } else if (startFrom % 3 == 0 && startFrom % 5 == 0 && startFrom % 7 == 0) {
                System.out.print("CozaLozaWoza ");
            } else if (startFrom % 5 == 0 && startFrom % 7 == 0) {
                System.out.print("WozaLoza ");
            } else if (startFrom % 3 == 0 && startFrom % 7 == 0) {
                System.out.print("CozaWoza ");
            } else if (startFrom % 3 == 0 && startFrom % 5 == 0) {
                System.out.print("CozaLoza ");
            } else if (startFrom % 7 == 0) {
                System.out.print("Woza ");
            } else if (startFrom % 5 == 0) {
                System.out.print("Loza ");
            } else if (startFrom % 3 == 0) {
                System.out.print("Coza ");
            } else
                System.out.print(startFrom + " ");
                startFrom++;

        }
    }



    //LAB 13 Metoda pt afisare Array:
    public void printArray (int [] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }


    //Lab 13/ ex 2
    public int[] getArrayHundred() {
        int[] array = new int[100];

        for (int i = 0; i < 100; i++) {
            array[i] = i + 1;
        }
        return array;
    }

    //Lab 13/ ex 3
    public int[] evenNumbersArray (int[] array) {

        int j = 0;

        for (int i = 1; i < 100; i++) {
            //array[i] = i + 1;

            if (i % 2 == 0) {
                array[j] = i;

                System.out.println(array[j]);

                j++;
            }

        }
        return array;

    }


    //Lab 13/ ex 4
    public float averageArray (int [] array) {
        float sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum / array.length;

    }

    //Lab 13/ ex 5

    public boolean returnStringArray (String [] array, String findIt) {
        for (String whatever : array) {
            if (whatever.equals(findIt))
                return true;
        }
        return false;
    }

    //Lab 13/ ex 6
    public int checkPosition (int[] array, int number){


        for (int i = 0 ; i < array.length ; i++) {
            if (array[i] == number)

                return i;
        }
       return 0;
    }


    //Lab 13/ ex 7  Two Dimensional String array

    public void linePattern () {

    char[] line = {'-', '-', '-', '-', '-', '-', '-', '-', '-', '-',};

        for (int i = 0; i <= 10; i++) {
        System.out.println(line);
        }
    }


    /*public void pattern () {
        char lines [][] = new char [9][9];

        for (int i = 0; i < lines.length; i++) {
            char subArray [] = lines [i];
            System.out.print('-' + " " );


            for (int j = 0; j < subArray.length; j++) {
                System.out.print('-' + " ");
            }
            System.out.println();
        }

    } */



    //Lab 13/ ex 8

    /*public int[] returnWithoutGivenNumber (int[] array, int number){

        for(int i = 0 ; i < array.length ; i++){
            array[i] = i + 1;

            if (array[i] == number){
                continue;
            }
            System.out.print(array[i]+ " ");
        }
        return array;
    }*/


    public int[] removeNrFromArray(int[] myArray, int nr) {

        int[] secondArray = new int[myArray.length];
        int j = 0;

        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] == nr)
                continue;

            secondArray[j++] = myArray[i];
        }

        int[] finArray = new int[j];
        for (int i = 0; i < j; i++)

            finArray[i] = secondArray[i];

        return finArray;

    }


    //Lab 13/ ex 9
    public int returnSecondSmallest (int [] array) {

        for (int i = 0; i < array.length; i++) {
            Arrays.sort(array);
        }

        return array[1];
    }


    //Lab 13/ ex 10
    public void copyArray (int[] originalArray, int[] emptyArray){

        for(int i = 0; i < originalArray.length; i++){
            emptyArray[i] = originalArray[i];
        }
    }



    //--------------- Tema Optionala LAB 13 -----------------------



    // 3 cel mai mic nr si cel mai mare
    public void minMax (int [] array) {

        int max = array[0];
        int min = array[0];


        for (int i = 1; i < array.length; i++) {

            if (array[i] < min) {
                min = array[i];
            }

            if (array[i] > max) {
                max = array[i];
            }

        }

        System.out.println("Minimum number: " + min);
        System.out.println("Maximum number " + max);

    }


    // 4 inversare (prima valoare se schimba cu ultima)
    // avem de la 1 pana la n, se schimba:
    // 1 cu n; 2 cu n-1, 3 cu n - 2

    public void reverseArray (int [] array) {

        System.out.println("Original array: " + Arrays.toString(array));

        for (int i = 0; i < array.length/2; i++){

            int rev = array[i];
            array[i] = array[array.length -i -1];
            array[array.length -i -1] = rev;
        }
        System.out.println("Array after reverse: " + Arrays.toString(array));
    }


    // 5 find duplicate values

    public void duplicated (int[] array) {

        System.out.println("Original array: " + Arrays.toString(array));

        for (int i = 0; i < array.length; i++){

            for (int j = i + 1; j < array.length; j++) {

                if (array[i] == array [j]) {
                    System.out.println("Repeated elements: " + array[i]);
                }
            }

        }

    }



    // 6
    public void similarValues (String[] firstArray, String[] secondArray)  {

        System.out.println(Arrays.toString(firstArray));
        System.out.println(Arrays.toString(secondArray));

        for (int i = 0; i < firstArray.length; i++){

            for (int j = 0; j < secondArray.length; j++) {

                if (firstArray[i].equals(secondArray [j])) {
                    System.out.print (firstArray[i] + " ");
                }
            }
        }
    }


    // 7
    public int[] returnAscending (int [] array) {
        System.out.println("Original array: " + Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {
            Arrays.sort(array);

        }

        return array;
    }



    //----------------------------------------- LAB 14 LISTS -----------------------------------------------
    // print list (ex curs )
    public void printList (List<Integer> myList) {
        /*for (int i = 0; i < myList.size(); i++ ){
            System.out.println(myList.get(i));
        }*/

        for (int i : myList) {
            System.out.println(i);
        }

    }


    // ex 2
    public void addValueToList (List<Integer> originalList, int number) {
        originalList.add(number);
    }


    //ex 3
    public void startListFromPosition (List<Integer> list, int startFromPosition) {

        for (int i = startFromPosition; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

    }

    //ex 4
    public void reverseList (List<Integer> list) {
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.println(list.get(i));
        }

    }


    //ex 5
    public void addString (List<String> list, String element, int position) {
            list.add(position, element);

    }


    //ex 6
    public void moveSecondValueToFirstIndex (List<Integer> list, int numberToAdd) {
        list.add(0, numberToAdd);
    }


    //ex 7
    public void printValuesAndPositions (List<Integer> list) {

        for (int i = 0; i < list.size(); i++) {

            System.out.println("Pe pozitia " + i + " este valoarea " + list.get(i));

        }

    }

    //ex 8
    public int returnMaxValue (List<Integer> list) {

        int max = 0;

        for (int i = 0; i < list.size(); i++) {
            if ( list.get(i) > max) {
                max = list.get(i);

            }
        }

        System.out.println(max);
        return max;

    }

    //----- Tema optionala Lists ------
    //ex 1

    public void switchPosition (List<Integer> list, int firstIndex, int secondIndex) {
        System.out.println("original list: " + list);



        int firstValue;
        int secondValue;

        firstValue = list.get(firstIndex);
        secondValue = list.get(secondIndex);

        list.remove(firstIndex);
        list.add(firstIndex, secondValue);

        list.remove(secondIndex);
        list.add(secondIndex,firstValue);


        System.out.println(list);


    }



















}

















