package ex_24_Collection.LIST.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Lab003_List {
    static void main() {

        List list = new ArrayList();  //dynamic dispatch >> List is interface and Arraylist is class of it
        List list2 = new ArrayList(); //we cannot create instance of List

        list.add("jayesh");  //add operation will add the parameters one by one as you declare
        list.add(123);

        System.out.println(list);
    }
}
