/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 barhom alko
 */
package ex36;

import java.util.*;
import java.util.stream.Collectors;

public class stat {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);//for taking user input
        ArrayList<Integer> numbers = new ArrayList< >();//create an array list of integers
        String entry;

        do {
            System.out.println("Enter a number: ");
            entry = input.next();

            if(!entry.equals("done")) {
                try {
                    int num = Integer.parseInt(entry);
                    numbers.add(num);
                }catch(NumberFormatException ignored) {

                }
            }
        }while(!entry.equals("done"));//as long as user does not entry "done"

        //print the numbers
        System.out.println("Numbers: "+numbers.stream().map(String::valueOf).collect(Collectors.joining(",")));
        //print avg
        System.out.println("The average is "+average(numbers));
        //print min
        System.out.println("The minimum is "+min(numbers));
        //print max
        System.out.println("The maximum is "+max(numbers));
        //print standard deviation
        System.out.println("The standard deviation is "+String.format("%.2f", std(numbers)));


    }

    public static double average(ArrayList<Integer> numbers) {
        int total = 0;
        for(int num: numbers) {
            total += num;
        }
        return (double)(total)/numbers.size();
    }



    public static int max(ArrayList<Integer> numbers) {
        int max= numbers.get(0);

        for(int num: numbers) {
            if(num > max)
                max = num;
        }

        return max;
    }


    public static int min(ArrayList<Integer> numbers) {
        int min= numbers.get(0);

        for(int num: numbers) {
            if(num < min)
                min = num;
        }

        return min;
    }


    public static double std(ArrayList<Integer> numbers) {
        double mean = average(numbers);

        double sum = 0;
        for(int num: numbers) {
            sum = sum + Math.pow((num-mean), 2);
        }

        return Math.sqrt(sum/numbers.size());
    }

}
