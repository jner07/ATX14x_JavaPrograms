package ex_12_StringBuffer_StringBuilderFunctions;

import java.util.Scanner;

public class Lab001_ReverseString {
    public static void main() {
////        String str = "Jayesh";
//        StringBuilder stringbuilder = new StringBuilder("Jayesh");
//        stringbuilder.reverse();
//        System.out.println(stringbuilder); //this is string reverse by using reverse method available.


        //this is the way by taking user input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string and i will reverse it");
        String user_input = scanner.next();
        StringBuilder stringBuilder = new StringBuilder(user_input);
        System.out.println(stringBuilder.reverse());





    }
}
