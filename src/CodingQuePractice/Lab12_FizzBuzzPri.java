package CodingQuePractice;

import java.util.Scanner;

public class Lab12_FizzBuzzPri {
    public static void main() {
       Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int a =scanner.nextInt();

        if(a%3 ==0 && a%5==0) {
            System.out.println("Fizzbuzz");
        } else if (a%3 ==0){
            System.out.println("Fizz");
        } else if (a%5 ==0) {
            System.out.println("buzz");
        }

        /*for (int i = 1; i<=20; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }*/
        /*for (int i = 0; i <= 20; i++)
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("Value is Fizzbuzz");
            } else if (i % 3 == 0) {
                System.out.println("value is Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Value id buzz");
            }*/


}
}
