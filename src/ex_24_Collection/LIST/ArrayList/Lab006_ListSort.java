package ex_24_Collection.LIST.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lab006_ListSort {
    static void main() {
        List marks = new ArrayList();
        marks.add(93);
        marks.add(23);
        marks.add(76);
        marks.add(12);

        System.out.println(marks);
        Collections.sort(marks);  //this will sort the numbers in ascending
        System.out.println(marks);

        Collections.sort(marks, Collections.reverseOrder()); //this will reverse the order
        System.out.println(marks);  //natural sorting is used in collections
    }
}
