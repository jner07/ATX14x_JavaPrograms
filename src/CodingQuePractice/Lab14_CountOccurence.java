package CodingQuePractice;

import java.util.Scanner;

public class Lab14_CountOccurence {
    public static void countOccurence(String str){
        int[] freq = new int[256];

        for (int i =0; i< str.length(); i++){
            freq[str.charAt(i)]++;
        }

        System.out.println("/n character occurrence");
        System.out.println("-------------------");
        for (int i =0; i<256; i++){
            if (freq[i] !=0) {
                System.out.println("'" + (char) i + "' -> " + freq[i] + "time(s)");
            }
        }
    }

    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string");
        String input = scanner.nextLine();

        countOccurence(input);
    }

}
