package CodingQuePractice;

import java.util.Scanner;

public class Lab12_ReverseEachWord {

    public static String ReverseEachWord(String sentence) {
        String[] words = sentence.split(""); //split the sentence into words
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            StringBuilder sb = new StringBuilder(word);
            result.append(sb.reverse()); //reverse each word
            result.append(""); //add space between words
        }
        return result.toString().trim(); //remove trailing spaces

    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence");
        String input = sc.nextLine();

        System.out.println(ReverseEachWord(input));
    }
}