package ex_03_Operators;

public class Lab003_Concat {
    public static void main(String[] args) {

        //+ operator will act as concat when string data type is used
        String str1= "jayesh";
        String str2= "Ner";
        System.out.println(str1+str2);

        // //+ operator will act as addition when int data type is used
        int a = 10;
        int b = 20;
        System.out.println(a+b);

        //if we try to perform both operations in one method, first assignment will be considered
        System.out.println(str1+str2+a+b);
        // here, string and integer both are concatenated as it cannot perform two operations at same time

        System.out.println(a+b+str1+str2);
        //here integer performed addition and strings are concatenated.

        //to overcome the first scenario you can add bracket to integer addition
        System.out.println(str1+str2+ (a+b) );
    }
}
