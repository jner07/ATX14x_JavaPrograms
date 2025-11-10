package ex_24_Collection.MAP;

import java.util.*;

public class Lab001_AllMap {
    static void main() {
        Map hm = new HashMap();
        hm.put(1,1);           //no order maintained, stored in format of key and value
        hm.put("name", "jayesh"); //duplicates not allowed
        hm.put("no", "927150637");
        hm.put(1,1);
        hm.put(null, "Value");  //only one null allowed
        hm.put("ID", null);  //only one null allowed >> for one side.
        System.out.println(hm);
        System.out.println(hm.keySet());
        System.out.println(hm.values());

        Map lh = new LinkedHashMap();
        lh.put(1,1);           // order maintained as inserted
        lh.put("name", "jayesh"); //duplicates not allowed
        lh.put("no", "927150637");
        lh.put(1,1);
        lh.put(null, "Value");  //only one null allowed
        lh.put("ID", null);  //only one null allowed >> for one side.
        System.out.println(lh);

        Map tm = new TreeMap();
//        tm.put(1,1);
        tm.put("name", "jayesh"); //duplicates not allowed
        tm.put("no", 927150637);  //same data type accepted only for KEY and VALUE
//        tm.put(null, "Value");  // null not allowed
        System.out.println(tm);

        System.out.println("----------------------------");

        List m = new ArrayList();
        m.add(tm);  //this is stored in json format
        m.add(lh);
        m.add(hm);
        System.out.println(m);
    }
}
