package ex_22_Exceptions;

import java.lang.classfile.CustomAttribute;
import java.util.Scanner;

public class Lab006_Throw {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        if (!scanner.next().equalsIgnoreCase("Jayesh")){
            throw new ArithmeticException("Custom Exception here");

        }
    }
}
