package ex_12_StringBuffer_StringBuilderFunctions;

public class Lab003_Palindrome {
    static void main() {
        //palindrome is the word which sounds same when spelled from back or from front
        String input = "jayesh";
        String reverse = "";

        for(int i=input.length()-1;i>=0;i--){
            reverse = reverse + input.charAt(i);
        }

        if(reverse.equalsIgnoreCase(input)){
            System.out.println("this is palindrome");

        }else {
            System.out.println("not a palindrome");
        }


    }
}
