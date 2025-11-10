package ex_24_Collection.LIST.Stack;

import java.util.Stack;

public class Lab001_Stack {
    static void main() {
        Stack stack = new Stack();
         //Stack is used in format of LAST IN FIRST OUT >> LIFO
        //consider a container where stacks are inserted. the last stack inserted will go out first always

        stack.add("212");
        stack.add("jay");
        stack.add(7869);
        stack.push(987);

        System.out.println(stack);
        System.out.println(stack.size()); //gets the size
        System.out.println(stack.peek()); //this will give the value thats on top >> consider stack ex above
        System.out.println(stack.pop()); //this will remove the top value, print sout & it will remove and print rem values
        System.out.println(stack);
    }
}
