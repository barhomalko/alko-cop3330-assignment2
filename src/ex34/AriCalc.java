/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 barhom alko
 */
package ex34;

import java.util.ArrayList;
import java.util.Scanner;

public class AriCalc {

    boolean removeName(ArrayList names, String del)
    {

        names.remove(del);

        return true;
    }

    public static void main(String []args)
    {

        AriCalc obj=new AriCalc();

        ArrayList<String> names=new ArrayList();
        names.add("John Smith");
        names.add("Jackie Jackson");
        names.add("Chris Jones");
        names.add("Amanda Cullen");
        names.add("Jeremy Goodwin");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the name to delete");
        String del=sc.nextLine();
        obj.removeName(names,del);
        System.out.println(names);
    }
}


