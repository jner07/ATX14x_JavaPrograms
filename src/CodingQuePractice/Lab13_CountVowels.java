package CodingQuePractice;

import java.security.PublicKey;
import java.util.Scanner;

public class Lab13_CountVowels {
    public static int countVowels(String str) {
        int count = 0;
        str = str.toLowerCase();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        return count;
    }

    static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string");
        String input = scanner.nextLine();

        int result = countVowels(input);
        System.out.println("Number of vowels: " + result);
    }
}
