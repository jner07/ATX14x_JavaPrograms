package ex_15_Inheritance.Hierarchial;

public class Lab001_Hierarchial {
    static void main() {
        Jayesh j1 = new Jayesh(); //all can access only from father //not from each other
        j1.home();
        j1.car();

        Priya p1 = new Priya();
        p1.home();
        p1.mobile();

        undir u1 = new undir();
        u1.home();
        u1.gold();
    }
}
