package app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        System.out.println("please enter the correct number");

       int done = 1;


        while(done < 2){
        int number = input.nextInt();

        if (number == 30){
            System.out.println("correct");
            done = done + 2;
        }
        else if (number < 30){
            System.err.println("low");


        
            
    }
    else if (number > 30){
        System.err.println("high");
    }
}
        
    }
}
