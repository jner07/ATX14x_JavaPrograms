package ex_22_Exceptions;

public class Lab004_MultipleCatch {
    static void main() {
        int a = 0;
        int b = 0;
        try {
            b = 10/b;
        } catch (ArithmeticException | NullPointerException | ArrayIndexOutOfBoundsException e) {
    //we can declare exception if we already know it. Multiple exceptions can be entered here with separator /OR ( | )
            System.out.println("cannot perform this ope >> arithmetic exception");

        } catch (Exception e) {        //if unhandled create another catch and declare exception
            System.out.println("this came to bigger exception");

        }finally {
            System.out.println("finally will be always executed"); //finally is used to close the code even if it has exceptions
        }
    }
}
