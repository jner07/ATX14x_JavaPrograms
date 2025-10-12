package ex_Test_tasks;

import java.util.Enumeration;
import java.util.Scanner;

public class Lab004_Pos_Neg_number {
    static void main() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your Number");
        int num = scanner.nextInt();

        if (num > 0){
            System.out.println(num + " is positive number");
        } else if (num<0) {
            System.out.println(num + " is negative number");

        }else {
            System.out.println("you entered ZERO");
        }
    }

    }

