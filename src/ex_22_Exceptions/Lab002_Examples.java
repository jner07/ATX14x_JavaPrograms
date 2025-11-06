package ex_22_Exceptions;

public class Lab002_Examples {
    static void main() {
        String a = null;
        a.trim(); //since no string is declared and its null >> unchecked exception will be thrown
        //java.lang.NullPointerException
    }
}
