package ex_21_WrapperClass;

public class Lab004_AutoBoxing_unboxing {
    static void main() {
        int a = 20;
        Integer aa = a;
        //autoboxing >> JVM will convert primitive to wrapper automatically as soon as 'a' is assigned to 'aa'

        System.out.println(aa.intValue()); //unlocked more functions for aa
        System.out.println(a);  // no functions for a

        //Unboxing
        Integer bb= 43;
        int b = bb;
        System.out.println(b); //Wrapper is converted into integer primitive data type
    }
}

            //Wrapper class degrades performance but have multiple advantages to be used
