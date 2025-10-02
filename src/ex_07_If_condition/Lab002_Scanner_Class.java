package ex_07_If_condition;

import javax.xml.transform.Source;
import java.util.Scanner;

public class Lab002_Scanner_Class {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Whats your age");
        int age = scanner1.nextInt();
        System.out.println("Your age is " + age);
    }
}
