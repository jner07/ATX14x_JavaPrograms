package ex_18_Super_abstraction.abstraction;

public class Abstraction_class {
    static void main() {

    }
}


    interface Jayesh {
    int a = 10;           //this will be final as its declared under interface
    void display();
    }

    class Ner implements Jayesh {

        int aa = 10;  //this is under same class so can be called using THIS keyword

        @Override
        public void display() {
            System.out.println(a);  //this can be directly called without using SUPER keyword
            // as its incomplete class
            System.out.println(this.aa);

        }


    }

