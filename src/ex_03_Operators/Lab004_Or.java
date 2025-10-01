package ex_03_Operators;

public class Lab004_Or {
    public static void main(String[] args) {
        int jayesh_salary = 12;
        boolean b= !(jayesh_salary >10 || jayesh_salary < 5);
        System.out.println(b);
        //A=jayesh salary >10 = TRUE
        //B=jayesh salary >5 = false
        // A || B = true
        // as we are doing reverse (!), answer will be false

    }
}
