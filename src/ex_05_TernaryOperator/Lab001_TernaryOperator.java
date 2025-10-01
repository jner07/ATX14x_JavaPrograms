package ex_05_TernaryOperator;

public class Lab001_TernaryOperator {
    public static void main(String[] args) {
        int age = 22;
        String CanJayeshVote = age > 21 ? "Wohho, Jayesh can vote" : "Seeyah after few years";
        //String = condition ? "option1" : "option2";
        System.out.println(CanJayeshVote);

        int count = 15;
        String CountOfPeople = count > 16 ? "count is greater" : "count is not greater" ;
        System.out.println(CountOfPeople);

        //here you can add only two conditions.

    }
}
