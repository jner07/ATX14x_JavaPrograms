package ex_03_Operators;

public class Lab006_NewOperator {
    public static void main(String[] args) {
        String str1 = new String("Jayesh");
//        String str1 = "Jayesh";
        int a =10;
        System.out.println( str1 instanceof String );
        // this returns boolean value as Str1 is child of string
        // instanceof is used only for non=primitive data types
    }
}
