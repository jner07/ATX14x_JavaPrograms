package ex_Test_tasks;

public class Lab003_comparitiveOperators {
    static void main() {
        int a = 15;
        int b = 10;

        System.out.println("equals > " + (a==b));
        System.out.println("not equals > " + (a!=b));
        System.out.println("less than > " + (a<b));
        System.out.println("Greater than > " + (a>b));
        System.out.println("Less than equal > " + (a<=b));
        System.out.println("Greater than equal > " + (a>=b));

        //logical operators
        System.out.println( (a<b) && (a>b) );
        System.out.println( (a<b) || (a>b) );
    }
}
