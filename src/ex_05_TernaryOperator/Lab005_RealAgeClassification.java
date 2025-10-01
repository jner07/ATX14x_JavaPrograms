package ex_05_TernaryOperator;

public class Lab005_RealAgeClassification {
    public static void main(String[] args) {
        String user_input = args[0]; //we have given user input value as 68 from edit configurations.
        System.out.println(user_input);
        System.out.println(user_input instanceof String); // to check whether the value is considered as string or integer

        int age = Integer.parseInt(user_input);

        String result = (age < 18) ? "Minor" : (age < 60)? "Adult" : "Sr. Citizen" ;
        System.out.println(result);

    }
}
