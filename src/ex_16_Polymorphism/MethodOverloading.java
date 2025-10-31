package ex_16_Polymorphism;

   public class MethodOverloading {
       static void main() {
           Calc c1= new Calc();
           c1.add(3.4, 4.4);
           //if int values given, then first method will be called and so for double
           //methods are called before compiling them --> this is called method overloading
       }

   }
    class Calc {

        int add(int a, int b) {
            return a + b;
    }

        double add(double a, double b) {
            return a + b;
    }

        double add(double a, double b, double c) {
            return a + b + c;   //we can consider same data type with diff parameter as well
        }

    }