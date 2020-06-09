package com.company;


public class Lab15 {

    public static void main(String[] args) {


        Read read = new Read();

        int inputI = read.getInt();

        float inputF = read.getFloat();

        double inputD = read.getDouble();

        byte inputB = read.getByte();

        read.arrayIndexInput(4);

        read.returnList();

        LogicalOp logical = new LogicalOp();


        int [] myArray  = {1, 2, 8, 65, 97};
        logical.insideCatchLarge(myArray, 4);

       logical.waitTwo(7);










    }
}
