package ex_24_Collection.LIST.ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lab007_ArraylistwithInput {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        List list = new ArrayList<>();
        String continueInput= "Y";
        List<String> names = new ArrayList<>();
        while (continueInput.equalsIgnoreCase("Y")){
            System.out.println("What's your name");
            String name = scanner.next();
            names.add(name);
            scanner.nextLine();

            System.out.println("do you want to give another name");
            continueInput = scanner.nextLine();

        }

            for (String name:names){
                System.out.println(name);
            }
            scanner.close();

    }
}
