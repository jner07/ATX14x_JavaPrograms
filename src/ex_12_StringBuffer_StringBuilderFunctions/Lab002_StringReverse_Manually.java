package ex_12_StringBuffer_StringBuilderFunctions;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Lab002_StringReverse_Manually {
    static void main() {
        //write a program to reverse the string without using in built function

      /*  Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your string and i will reverse it");
        String user_input = scanner.next(); //this block will take user inputs

        String reverse_user_input = "";  //this will be blank as to create a variable only

        for (int i = user_input.length()-1; i >=0 ; i--) {
            reverse_user_input = reverse_user_input + user_input.charAt(i);
               //will use -1 after length as length counts from 1 and index of for loop counts from 0
        }

        System.out.println(reverse_user_input);*/


           Scanner scanner = new Scanner(System.in);
        System.out.println("enter your string and i will reverse it");
        String user_input = scanner.next();

        String reverse_user_input = "";

        for (int i = user_input.length()-1;i>=0;i--){
            reverse_user_input = reverse_user_input + user_input.charAt(i);

        }
        System.out.println(reverse_user_input);


    }
}