/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 barhom alko
 */
package ex38;

import java.util.*;

public class filter
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a list of numbers, separated by spaces: ");
        String data = in.nextLine();
        String[] list = data.split(" ");
        Integer[] evenList = filterEvenNum(list);
        System.out.print("The even numbers are ");

        for(int i=0; i<evenList.length; i++){
            if(i < evenList.length-1){
                System.out.print(evenList[i] + " ");
            }
            else
            {
                System.out.print(evenList[i] + ".");
            }
        }
    }
    public static Integer[] filterEvenNum(String[] list) {

        ArrayList<Integer> newList = new ArrayList<>();

        for (String s : list) {
            int num = Integer.parseInt(s);
            if (num % 2 == 0) {
                newList.add(num);
            }
        }

        Integer[] arr = new Integer[newList.size()];
        arr = newList.toArray(arr);
        return arr;
    }
}
