package ex_15_Inheritance.SingleInheritance.ex_15_multilevel.ex_15_SingleLevel;

public class Lab001_SingleInheritance {
    static void main() {
        Son Jayesh = new Son();
        System.out.println(Jayesh.gold);
        Jayesh.bhk2();
        Jayesh.bhk3();

        System.out.println("--------------------");

        Father f1 = new Father();
        System.out.println(f1.gold);
        f1.bhk2();


    }
}
