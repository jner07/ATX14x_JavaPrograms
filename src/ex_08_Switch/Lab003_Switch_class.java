package ex_08_Switch;

import java.util.Scanner;

public class Lab003_Switch_class {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter value between 1 to 7");
         if(scanner.hasNextInt()) {
             int day = scanner.nextInt();
             switch (day){
                 case 1:
                     System.out.println("Monday");
                     break;
                 case 2:
                     System.out.println("Tuesday");
                     break;
                 case 3:
                     System.out.println("Wed");
                     break;
                 case 4:
                     System.out.println("thursday");
                     break;
                 case 5:
                     System.out.println("friday");
                     break;
                 case 6:
                     System.out.println("Saturday");
                     break;
                 case 7:
                     System.out.println("Sunday");
                     break;
                 default:
                     System.out.println("Enter the value between given range");
                     break;
             }



        }else {
            System.out.println("Enter the int value only");
        }




    }
}
