package ex_15_Inheritance.multilevel;

public class Multilevel {
    static void main() {
        Son Jayesh = new Son();
//        System.out.println(Jayesh.home);
        Jayesh.home();
        Jayesh.extra();
        Jayesh.bike();
        Jayesh.Car();

        Father f = new Father();
        f.home();
        f.extra();
        f.bike();

        GrandFather gf = new GrandFather();
        gf.home();

        //dynamic dispatch -- this can be achieved in downward hierarchy only
        GrandFather s1 = new Father();
        GrandFather s2 = new Son();
        Father s3 = new Son();




    }
}
