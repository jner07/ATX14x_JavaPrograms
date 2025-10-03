package ex_09_ForLoop;

public class Lab002_ForLoop {
    public static void main(String[] args) {

        for (int a = 0; a > 1; a++) {
            System.out.println(a); // here the value of 'a' is lesser than 1,
            // hence jvm exited from the loop and printed the message out from the loop.

        }
        System.out.println("exited loop and printed this"); // this message is from outside of the loop
    }
}
