package ex_24_Collection.LIST.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Lab001_ArrayList {
    static void main() {
        List fruits = List.of("Banana", "Apple", "grapes", "mango");
        System.out.println(fruits);

        List arraylist = new ArrayList(); //if we declare <Integer> here then it will only accept integer values
        arraylist.add("jayesh");  //collections are generic hence, we can store any data type
        arraylist.add("jayesh");
        arraylist.add(123);
        arraylist.add(true);
        arraylist.add(3.14); //this all are wrapper classes, primitive data types like int a >> are not allowed

        System.out.println(arraylist); //just printing variable will show all the elements
        System.out.println(arraylist.size()); //size starts from 1
        System.out.println(arraylist.isEmpty());
    }
}
