package app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        System.err.println("please enter a number");

        int number = input.nextInt();

        System.err.println("Please enter another bigger number");

        int number2 = input.nextInt();

        while(number < number2){
        if(number % 2 == 0){
            System.out.println(number);
        }
        number ++;

       
    }
        
    }
}
