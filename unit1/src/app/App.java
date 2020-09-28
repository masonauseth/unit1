package app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        System.out.println("What is my name?");

        String answer1 = input.nextLine();
        if (answer1.equals("Mason")){
            System.out.println("correct");
        }
        else {
            System.out.println("Wrong");
        }

        System.out.println("Who is the President?");

        String answer2 = input.nextLine();
        if (answer2.equals("Donald Trump")){
            System.out.println("correct");
        }
        else{
            System.out.println("wrong");
        }




    }
}