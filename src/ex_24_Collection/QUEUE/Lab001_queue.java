package ex_24_Collection.QUEUE;

import java.util.PriorityQueue;
import java.util.Queue;

public class Lab001_queue {
    static void main() {
        Queue q = new PriorityQueue();
        q.add(1);  //duplicates are allowed
        q.add(2);  //queue works on FIFO
        q.add(3);
        q.add(3);
//        q.add(null); // null not allowed
        System.out.println(q);
        System.out.println(q.poll()); //removed the first element
        System.out.println(q);
    }
}
