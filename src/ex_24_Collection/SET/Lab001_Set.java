package ex_24_Collection.SET;

import java.util.*;

public class Lab001_Set {
    static void main() {

        Set hs = new HashSet();
        hs.add("jayesh");   //Hashset works on hashing mechanism, it creates a hash code for each data
        hs.add("jayesh");  //no duplicates allowed. it will not show any error but will not print the duplicate one
        hs.add(123);   //no order is maintained. it will print in any order
        hs.add(976);
        hs.add("opp");
        hs.add(null); //null is allowed
        System.out.println(hs);


        Set lhs = new LinkedHashSet();
        lhs.add("dapple");
        lhs.add("apple");  //LinkedHashset is used when you have to maintain the order with no duplicates allowed
        lhs.add(null);
        lhs.add("orange");
        lhs.add("orange");
        System.out.println(lhs);
        System.out.println(lhs.contains("apple"));


        Set ts = new TreeSet();
        ts.add(1);   //treeset sorts the data by natural sorting
        ts.add(2);   //treeset does not allow multiple data type >> it will throw classexception
        ts.add(3);
        ts.add(4);
        ts.add(4); //no diuplicates allowed , no null allowed
        System.out.println(ts);

        Iterator iterator = ts.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());

        }    }
}

     // Hashset >> No order maintained, duplicates not allowed, one null allowed
     // LinkedHashset >>  order maintained, duplicates not allowed, one null allowed
     // Treeset >> natural order maintained, duplicates not allowed, no null allowed
