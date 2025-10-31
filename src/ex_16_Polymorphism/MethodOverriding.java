package ex_16_Polymorphism;

public class MethodOverriding {
    static void main() {
        /*Jayesh j1 = new Jayesh();
        j1.home();*/

        /*Father f1 = new Father();
        f1.home();*/

        Father f2 = new Jayesh(); //dynamic dispatch = this will call the Jayesh class as its assigned
        f2.home();
    }

}

  class Father {
    void home(){
        System.out.println("father home");
    }
  }
   class Jayesh extends Father{
    void home(){
        System.out.println("Jayesh home");
    }
   }

