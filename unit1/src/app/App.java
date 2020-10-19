package app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

       System.out.println("We will be playing the Roulette wheel!");

       System.out.println("You have $100");

       System.out.println("Would you like to make a inside or outside bet");

      String bettype = input.nextLine();

      if(bettype.equals("inside")){
          System.out.println("what number do you want to bet on");
          
      }
      else{

      }

        
    }
}
