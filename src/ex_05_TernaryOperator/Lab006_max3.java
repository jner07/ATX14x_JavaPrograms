package ex_05_TernaryOperator;

public class Lab006_max3 {
    public static void main() {
        int a =3;
        int b =-9;
        int c=15;

        int max = (a > b) ? (a > c) ? a : c : (b > c) ? b : c;
        System.out.printf("the max value is %d", max );

    }
}
