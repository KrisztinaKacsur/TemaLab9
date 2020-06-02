package com.company;

import java.util.ArrayList;
import java.util.List;

public class Lab14 {

    public static void main(String[] args) {

        LogicalOp logical = new LogicalOp();

        List<Integer> myList = new ArrayList();
        myList.add(1);
        myList.add(2);
        myList.add(9);
        myList.add(21);
        myList.add(31);
        myList.add(60);
        myList.add(74);
        myList.add(105);

        logical.printList(myList);
        System.out.println("\n");

        logical.addValueToList(myList, 5);
        System.out.println(myList + "\n");

        logical.startListFromPosition(myList, 4);
        System.out.println("\n");

        logical.reverseList(myList);
        System.out.println("\n");

        List<String> myStringList = new ArrayList();
        myStringList.add("Apple");
        myStringList.add("Car");
        myStringList.add("Coffee");
        myStringList.add("Milk");

        logical.addString(myStringList, "Elephant", 4);
        System.out.println(myStringList);

        logical.moveSecondValueToFirstIndex(myList, 100);
        System.out.println(myList + "\n");

        logical.printValuesAndPositions(myList);
        System.out.println("\n");

        logical.returnMaxValue(myList);
        System.out.println("\n");

        logical.switchPosition(myList, 2, 3);
        System.out.println("\n");


        List<Integer> myEven = new ArrayList<>();
        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(4);
        myList.add(5);
        myList.add(6);
        myList.add(7);
        myList.add(8);























    }
}
