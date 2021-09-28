/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 barhom alko
 */
package ex30;

public class multitable {

    public static void main(String[] args) {
        int tableSize = 12;
        printmultitable(tableSize);
    }

    public static void printmultitable(int tableSize) {
        System.out.format("      ");
        for(int i = 1; i<=tableSize;i++ ) {
            System.out.format("%4d",i);
        }
        System.out.println();
        System.out.println("------------------------------------------------------");

        for(int i = 1 ;i<=tableSize;i++) {
            System.out.format("%4d |",i);
            for(int j=1;j<=tableSize;j++) {
                System.out.format("%4d",i*j);
            }
            System.out.println();
        }
    }

}
