package ex_24_Collection.LIST.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Lab005_Arraylist_multi {
    static void main() {
        List <String> fruits1 = new ArrayList();
        fruits1.add("papaya");
        fruits1.add("mango");
        fruits1.add("banana");
        System.out.println(fruits1);

        List fruits2 = new ArrayList();
        fruits2.add("apple");
        fruits2.add("kiwi");
        fruits2.add("chiku");
        System.out.println(fruits2);

        List vegies = new ArrayList();
        vegies.add("tomato");
        vegies.add("onion");
        vegies.add("potato");
        System.out.println(vegies);

        List all = new ArrayList();
        all.add(fruits1);
        all.add(fruits2);
        all.add(vegies);
        System.out.println("list of all fruits and veggies >> " + all);
        System.out.println(all.size());
        System.out.println(all.get(0)); // get start from 0
    }
}
