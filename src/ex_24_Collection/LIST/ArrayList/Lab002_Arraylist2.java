package ex_24_Collection.LIST.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lab002_Arraylist2 {
    static void main() {
        List a = new ArrayList();
        a.add("1");
        a.add("2");
        a.add(3);
        a.add("jayesh");
        a.add(3.14);
        a.add(true);

        System.out.println(a);
        System.out.println(a.isEmpty()); //boolean
        System.out.println(a.size()); //size starts from 1
        System.out.println(a.contains(3.14)); //this will return boolean
        System.out.println(a.indexOf("2")); //starts from 0
        System.out.println(a.lastIndexOf("jayesh")); //this will count index from bottom , starts from 1

        System.out.println("==================");

        for (int i = 0; i < a.size(); i++) {
            System.out.println(a.get(i)); //this will print all the items line by line

        }

        System.out.println("===="); //this is For each method and OR method for For loop
        for (Object z:a){
            System.out.println(z);
        }

        System.out.println("======="); //this is Iterator class and is OR method for above 2 methods
        Iterator iterator = a.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
