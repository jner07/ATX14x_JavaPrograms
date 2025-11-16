package ex_Test_tasks;

public class Challenge_5 {
    static void main() {
        Cat cd= new Dog();
        cd.makesound();
    }
}
    class Cat {
    void makesound() {
        System.out.println("Cat Says: Meow! Meow!");
    }
    }
    class Dog extends Cat {
        void makesound(){
            System.out.println("Dog says: Woof! Woof!");
        }
    }

