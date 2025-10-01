package ex_04_TypeCasting;

public class Lab002_typeCasting {
    public static void main(String[] args) {
        int course = 100;
        float GST = 18.40f;
//        int total1 = course+GST  //this is implicit - bigger to smaller container
        int total = course + (int) GST; //this is explicit - alternate way to perform implicit typecasting.
        System.out.println(total);
    }
}
