package ex_21_WrapperClass;

public class Lab002_WrapperFunctions {
    static void main() {
        int a = 10;

        Integer aa = a;   //autoboxing >> JVM automatically converts primitive to wrapper when aa has values assigned of a.

        System.out.println(aa.MAX_VALUE);
        System.out.println(aa.valueOf(aa));
        //like this, we can access more functions when we convert the primitive data types into a wrapper class

        // valueOf()  >> String to Wrapper
        // parseXO() >> String to Primitive
        // toString() >> Wrapper to String
    }
}


