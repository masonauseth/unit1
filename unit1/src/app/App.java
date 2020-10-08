package app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        System.out.println("please enter the correct number");

        int done = 0;

        int number = input.nextInt();

        while(done == 0)
        if (number == 30){
            System.out.println("correct");
            done = done +1;
        }
        else{

        if(number < 30){
            System.out.println("low");
        }

        if(number > 30){
            System.out.println("high");
        }}
    
        
    }
}
