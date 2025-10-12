package ex_13_Arrays;

public class Lab001_arrays {
    static void main() {
        int a = 10; // this is local variable
        int marks[] = {82, 88, 32, 67, 89, 56, 46};

        boolean married[] = {false, true, true};

        System.out.println(marks.length);
        System.out.println(marks[0]);
        System.out.println(marks[3]);
        //  System.out.println(marks[-1]); // this will throw ArrayIndexOutOfBoundsException

        String name = "Jayesh";
        String[] name_of_each_element = name.split("");
//        System.out.println(name_of_each_element);

        for (String s : name_of_each_element) {
            System.out.println(s);
        }

    }
}
