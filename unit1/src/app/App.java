package app;

import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        Random ran = new Random();

        int nl = ran.nextInt(35) + 1;

        int money = 100;

        int amountbet = 0;

        int red[] = { 1, 3, 5, 7, 9, 12, 14, 16, 18, 19, 21, 23, 25, 27, 30, 32, 34, 36 };

        int black[] = { 2, 4, 6, 8, 10, 11, 13, 15, 17, 20, 22, 24, 26, 28, 29, 31, 33, 35 };

        int even[] = { 2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24, 26, 28, 30, 32, 34, 36 };

        int odd[] = { 1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23, 25, 27, 29, 31, 33, 35 };

        boolean win = false;

        System.out.println("We will be playing the Roulette wheel!");

        System.out.println("You have $100");

        System.out.println("Would you like to make a inside or outside bet?");

        String bettype = input.nextLine();

        if (bettype.equals("inside")) {
            System.out.println("What number from 1 to 36 do you want to bet on?");
            int insidebet = input.nextInt();
            System.out.println("How much do you want to bet?");
            amountbet = input.nextInt();
            input.nextLine();
            System.out.println("You bet " + insidebet);
            System.out.println("Spining...");
            System.out.println("The number is " + nl);
            if (insidebet == nl) {
                System.out.println("You Won!");
                System.out.println("Your money is now $" + (money + amountbet * 36));
            } else {
                System.out.println("You Lost :(");
                System.out.println("Your money is now $" + (money - amountbet));
            }
        } else if (bettype.equals("outside")) {
            System.out.println("Would you like to bet on red, black, even, or odd?");
            String outsidebet = input.nextLine();
            System.out.println("You bet " + outsidebet);
            if (outsidebet.equals("red")) {
                System.out.println("How much would you like to bet?");
                amountbet = input.nextInt();
                input.nextLine();
                System.out.println("You bet " + amountbet);
                System.out.println("spinning...");
                System.out.println("The spin is " + nl);
                for (int i = 0; i < red.length; i++) {
                    if (nl == (red[i])) {
                        win = true;
                    }
                }

                if (win = true) {
                    System.out.println("You win");
                    System.out.println("your money is $" + (money + (amountbet * 2)));
                } else {
                    System.out.println("You lost");
                    System.out.println("Your money is now " + (money - amountbet));
                }

            } else if (outsidebet.equals("black")) {
                System.out.println("How much would you like to bet?");
                amountbet = input.nextInt();
                input.nextLine();
                System.out.println("You bet " + amountbet);
                System.out.println("spinning...");
                System.out.println("The spin is " + nl);
                for (int i = 0; i < black.length; i++) {
                    if (nl == (black[i])) {
                        System.out.println("you won");
                        win = true;
                        if (win = true) {
                            System.out.println("You win");
                            System.out.println("your money is $" + (money + (amountbet * 2)));
                        }

                    } else {
                        System.out.println("You lost");
                        System.out.println("Your money is now " + (money - amountbet));
                    }
                }
            }

            else if (outsidebet.equals("even")) {
                System.out.println("How much would you like to bet?");
                amountbet = input.nextInt();
                input.nextLine();
                System.out.println("You bet " + amountbet);
                System.out.println("spinning...");
                System.out.println("The spin is " + nl);
                for (int k = 0; k < even.length; k++) {
                    if (nl == (even[k])) {
                        System.out.println("you won");
                        win = true;
                        if (win = true) {
                            System.out.println("You win");
                            System.out.println("your money is $" + (money + (amountbet * 2)));
                        }

                    } else {
                        System.out.println("You lost");
                        System.out.println("Your money is now " + (money - amountbet));
                    }
                }
            } else if (outsidebet.equals("odd")) {
                System.out.println("How much would you like to bet?");
                amountbet = input.nextInt();
                input.nextLine();
                System.out.println("You bet " + amountbet);
                System.out.println("spinning...");
                System.out.println("The spin is " + nl);
                for (int p = 0; p < odd.length; p++) {
                    if (nl == (odd[p])) {
                        System.out.println("you won");
                        win = true;
                        if (win = true) {
                            System.out.println("You win");
                            System.out.println("your money is $" + (money + (amountbet * 2)));
                        }

                    } else {
                        System.out.println("You lost");
                        System.out.println("Your money is now " + (money - amountbet));
                    }
                }

            }
        }
    }

}
