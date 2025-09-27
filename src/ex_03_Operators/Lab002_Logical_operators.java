package ex_03_Operators;

public class Lab002_Logical_operators {
    public static void main(String[] args) {
        boolean a=true;
        System.out.println(!a); // not a, means false

        boolean b=true;
        System.out.println(!!b); //not b makes it false again not b makes it true.

        boolean c= false || true; // any one is true, then it will be true.
        System.out.println(c);
    }
}
