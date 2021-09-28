/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 barhom alko
 */
package ex27;

import java.util.*;
import java.util.regex.Pattern;

public class valInput {
    static String data = " ";

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first name: ");
        String FN = input.nextLine();
        System.out.print("Enter the last name: ");
        String LN = input.nextLine();
        System.out.print("Enter the ZIP code: ");
        String zip = input.nextLine();
        System.out.print("Enter the employee ID: ");
        String EID = input.nextLine();

       
        valinput(FN, LN, zip, EID);

    }

    //checks all
    public static void valinput(String FN, String LN, String zip, String EID) {
        boolean first = valFN(FN);
        boolean last = valLN(LN);
        boolean idFlag = valEID(EID);
        boolean zipFlag = valZC(zip);
        if (first && last && zipFlag && idFlag) {
            data = "There were no errors found.";
        }
        System.out.println(data);
    }
    //checks first name
    public static boolean valFN(String FN) {
        boolean status = true;
        if (FN.length() < 2) {
            data = data + "The first name must be at least 2 characters long.\n";
            status = false;
        }
        if (FN.length() == 0) {
            data = data + "The first name can't be blank.\n";
            status = false;
        }
        return status;
    }
    //checks last name
    public static boolean valLN(String LN) {
        boolean status = true;
        if (LN.length() < 2) {
            data = data + "The last name must be at least 2 characters long.\n";
            status = false;
        }
        if (LN.length() == 0) {
            System.out.println("The last name can't be blank.");
            status = false;
        }
        return status;
    }
    //checks zip
    public static boolean valZC(String zip) {
        boolean status = true;
        try {
            int number = Integer.parseInt(zip);
            if (zip.length() != 5) {
                data = data + "The zipcode must be a 5 digit number.\n";
                status = false;
            }
        } catch (Exception e) {
            data = data + "The zipcode must be a 5 digit number.\n";
            status = false;
        }
        return status;
    }
    //checks employee iD
    public static boolean valEID(String EID) {
        String pattern = "[a-zA-Z]{2}[-]{1}[0-9]{4}";// two letters, a hyphen, and four numbers.
        if (!Pattern.matches(pattern, EID)) {
            data = data + "The employee ID must be in the format of AA-1234.";
            return false;
        }
        return true;
    }

}