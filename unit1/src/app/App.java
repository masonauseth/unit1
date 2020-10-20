package app;

import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        Random ran = new Random();

        int nl = ran.nextInt(36);

        int money = 100;

       System.out.println("We will be playing the Roulette wheel!");

       System.out.println("You have $100");

       System.out.println("Would you like to make a inside or outside bet?");

      String bettype = input.nextLine();

      if(bettype.equals("inside")){
          System.out.println("What number from 0 to 36 do you want to bet on?");
          int insidebet = input.nextInt();
          System.out.println("How much do you want to bet?");
          int amountbet = input.nextInt();
          System.out.println("You bet " + insidebet);
          System.out.println("Spining...");
          System.out.println("The number is " + nl);
          if(insidebet == nl){
              System.out.println("You Won!");
              System.out.println("Your money is now " + (money + amountbet * 35));
          }
          else{
              System.out.println("You Lost :(");
              System.out.println("Your money is now " + (money - amountbet));
          }
      }
      else if(bettype.equals("outside")){
          System.out.println("Would you like to bet on red, black, even, or odd?");
          String outsidebet = input.nextLine();
          System.out.println("You bet " + outsidebet);
      }

      



     
      
      

        
    }
}
