package ex_09_ForLoop;

public class Lab001_ForLoop {
    public static void main(String[] args) {

//        for (int i=0; i<10; ){ // For loop is written as I:C:U -- Initialize, Condition,Upsert
//            System.out.println(i);
            // debug this code to understand how jvm repeats the
            // process and exits once the criteria meet
            // < = Less than
            // > = Greater than

        for(int i = 1; i <= 3; i++) {
            for(int j = 1; j <= 3; j++) {
                if(j == 2)
                    continue;
                System.out.print(i + "-" + j + " "); } }
        }
    }

