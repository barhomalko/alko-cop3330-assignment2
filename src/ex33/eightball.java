/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 barhom alko
 */
package ex33;

import java.util.*;

public class eightball {

    public static void main(String[] args) {
        String[] responses = new String[]{"Yes, of course!", "Without a doubt, yes.", "You can count on it.", "For sure!", "Ask me later." ,"I'm not sure.","I can't tell you right now." , "I'll tell you after my nap.","No way!" , "I don't think so." , "Without a doubt, no.", "The answer is clearly No."};
        Scanner sc = new Scanner(System.in);
        String question;
        while(true){
            System.out.print("Ask a question here: ");
            question = sc.nextLine();
            if(question.equals("No questions")){
                return ;
            }
            System.out.println();

            Random rand = new Random();
            int v = rand.nextInt(12);

            System.out.println("Ans: "+ responses[v]);
            System.out.println("\n");

        }
    }

}