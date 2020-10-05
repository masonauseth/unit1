package app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        int trys = 0;
        boolean done = false;

        while(done == false){
        System.out.println("please enter a pasward");
        String password = input.nextLine();
        if (trys <= 3) {
            if (password.equals("cows")) {
                System.out.println("Correct");
                done = true;
            } else {
                trys = trys + 1;
                System.out.println("Incorrect Pasword, your trys are " + trys + " out of 3");
                if(trys > 3){
                    System.out.println("Max trys reached, all data has been deleted");
                    done = true;
                }}


            }
        }
    }
}
