package CodingQuePractice;

public class Lab09_Palindrome {

    static void main() {
        String input = "you";
        String reverse = "";

        for (int i = input.length()-1; i>=0; i--){
            reverse = reverse+ input.charAt(i);
        }
        if (reverse.equalsIgnoreCase(input)){
            System.out.println("this is palindrome");
        }
        else {
            System.out.println("this is not palindrome");
        }
    }
     }
