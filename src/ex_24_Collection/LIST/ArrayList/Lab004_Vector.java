package ex_24_Collection.LIST.ArrayList;

import java.util.Vector;

public class Lab004_Vector {
    static void main() {
        Vector v = new Vector();

        v.add("jayesh");
        v.add("jayesh");   //vector is legacy class and have same features as Arraylist
        v.add(456);         //vector is thread safe hence its not use now
        v.add(3.24);

        System.out.println(v);
    }
}
