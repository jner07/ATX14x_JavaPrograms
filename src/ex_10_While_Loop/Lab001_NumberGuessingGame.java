package ex_10_While_Loop;

import java.util.Random;
import java.util.Scanner;

public class Lab001_NumberGuessingGame {
    public static void main(String[] args) {
        //guess the number between 1-100
        //program will give hints whether guessed number is low or high from the actual number

        Random random = new Random();
        int numberGuess = random.nextInt(101);
      //  System.out.println(numberGuess); // this prints random numbers.- will comment this to hide the number from user

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number");
        int guess;
        int attempts = 0;

        while (true){
            if (!scanner.hasNextInt()) {
                System.out.println("Invalid Input, please enter number only");
                scanner.next();
                continue;
            }
                guess = scanner.nextInt();
                attempts++;

                if (guess<1 || guess >100){
                    System.out.println("enter number only between 1-100");
                    continue;

                }
                if (guess < numberGuess){
                    System.out.println("too low, try again");
                } else if (guess> numberGuess){
                    System.out.println("too high, try again");
                }
                 else {
                    System.out.println("Correct number, you guessed it in " + attempts + "attempts"  );
                    break;
                }
            }
        }
    }

