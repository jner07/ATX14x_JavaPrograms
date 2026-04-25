package CodingQuePractice;

import java.util.Scanner;

public class Lab10_reverseStringManually {

    static void main() {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the string");
        String user_input = scanner.next();
        String reverse_input = "";

        for (int i =user_input.length()-1; i>=0; i--){
            reverse_input = reverse_input + user_input.charAt(i);
        }
        System.out.println(reverse_input);
    }

    }

