package app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        System.out.println("Lets learn about elephants. There are 5 facts, simply type a number from 1/5 and receive a fact.");

        String fact1 = "elephants are mammlals";

        String fact2 = "elephants are the largest land animal";

        String fact3 = "elephants can mourn for their dead";

        String fact4 = "elephants have very thick skin";

        String fact5 = "elephant tusks are actually teeth";

        int fact = input.nextInt();

        if(fact == 1){
            System.out.println(fact1);
        }
        
        if (fact == 2){
            System.out.println(fact2);
        }

        if(fact == 3){
            System.out.println(fact3);
        }

        if(fact == 4){
            System.out.println(fact4);
        }

        if(fact == 5){
            System.out.println(fact5);
        }
        if(fact > 5){
            System.out.println("fact not found, number over 5");
        }
        if(fact < 1){
            System.out.println("fact not found, number below 1");
        }

        

        


       





    }
}