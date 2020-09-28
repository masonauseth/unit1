package app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        System.out.println("Lets take a short test, dont use capitals unless its a name.");

        System.out.println("What is my creators name?");

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
        System.out.println("Where does paper come from?");

        String answer3 = input.nextLine();
        if (answer3.equals("trees")){
            System.out.println("correct");
        }
        else {
            System.out.println("wrong");
        }
        System.out.println("What do you see with?");
        String answer4 = input.nextLine();
        if (answer4.equals("eyes")){
            System.out.println("correct");
        }
        else {
            System.out.println("wrong");
        }
        System.out.println("What is the first meal of the day?");
        String answer5 = input.nextLine();
        if (answer5.equals("breakfast")){
            System.out.println("correct");
        }
        else {
            System.out.println("wrong");
        }




    }
}