package ex_24_Collection.LIST.LinkedList;

import java.util.*;

public class Lab001_Linkedlist {
    static void main() {
        List list = new LinkedList();
        list.add("123");
        list.add("jayesh");
        list.add(456);
        System.out.println(list);

        //linkedlist is similar to arraylist, it also have same functions belong to collections class.
        //the only difference is arraylist is stored in contagious memory hence manipulation is hard
        // linkedlist is stored in node format hence its easy to manipulate
        //when you have more updates/manipulation in code, use linkedlist
        //when you want to access the values faster, use arraylist
    }
}
