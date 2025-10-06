package ex_09_ForLoop;

public class Lab006_evenOdd_usingContinue {
    public static void main(String[] args) {
        for (int i = 0; i < 50; i++) {
            if (i % 2 ==0){ // to print even numbers  (i % 2 !=0 )
                continue; //Continue keyword will skip the value when IF condition is true
                //here whenever %2 == 0, that value would be skipped and it will ultimately print
                //only ODD numbers.
            }
            System.out.println(i);

        }
    }
}
