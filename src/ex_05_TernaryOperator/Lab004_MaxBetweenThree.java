package ex_05_TernaryOperator;

public class Lab004_MaxBetweenThree {
    public static void main(String[] args) {
        int n1= 7;
        int n2= 10;
        int n3= -11;

    int max = (n1 > n2) ? (n1 > n3) ? n1 : n3 : (n2 > n3) ? n2 : n3 ;
        System.out.printf("the max value is %d", max );
    }
}
