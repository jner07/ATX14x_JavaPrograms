package ex_05_TernaryOperator;

public class Lab002_NestedTernary {
    public static void main(String[] args) {
        int age = 17;
        String result = (age >18) ? (age > 25 ? "Yes, you can go to Goa" : "No cannot go to goa") : "No";
        System.out.println(result);

        int date = 24;
        String Dateavailable = (date > 23)? (date > 25 ? "You are coming" : "lets try to adjust") : "Sit home";
        System.out.println(Dateavailable);

        //to find the max number
        int  x= 10;
        int y= 30;
        System.out.println(Math.max(x,y));

//        int max = x > y? x : y;
//        System.out.println(max);
    }
}
