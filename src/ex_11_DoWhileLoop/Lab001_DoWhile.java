package ex_11_DoWhileLoop;

public class Lab001_DoWhile {
    public static void main(String[] args) {
        int age = 10;
        do {
            System.out.println("Body");
            System.out.println(age);
            age++;
        }while (age<15);
    } //the difference between while and do while is , do while runs at least one time. so it does not
    //keeps output empty.
}
