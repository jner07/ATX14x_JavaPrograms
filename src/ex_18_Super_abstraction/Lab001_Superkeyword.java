package ex_18_Super_abstraction;

public class Lab001_Superkeyword {
    static void main() {

    }

}

 class Fatherr{
    Fatherr (){
        System.out.println("DC Father");
    }
    int gold = 100;

    void home (){
        System.out.println("father home");
    }

    class Sonn extends Fatherr {
        Sonn (){
            super();
        }

        void bikee (){}

        void newhome(){
            System.out.println(super.gold);
            super.home(); //super will call the function from parent class (fatherr class)
            this.bikee(); //this will call the function of same class (sonn class)
        }
    }
 }


