package ex_13_Arrays;

import java.util.Scanner;

public class Lab003_LeftTriangle2d {
    static void main() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of * you want to print");
        int n = scanner.nextInt();

        for (int i=0; i<n; i++) {
            for (int j=0; j<=i; j++){
                System.out.print("*"); // in excel consider I,J  as X Y axis.
            }
            System.out.println("");
        }
    }
}
