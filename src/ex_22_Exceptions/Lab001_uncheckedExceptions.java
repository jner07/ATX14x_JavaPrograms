package ex_22_Exceptions;

public class Lab001_uncheckedExceptions {
    static void main(String[] args) {
        System.out.println("Start of the program");
        String ip = args[0]; //we have to get input from config
        // as no value was derived in config >> unchecked exception thrown java.lang.ArrayIndexOutOfBoundsException
        //if user give 0 in config it will throw java.lang.ArithmeticException as 100/0 will break the code
        //if user enters characters or string in this operation we'll get java.lang.NumberFormatException

        int a = Integer.parseInt(ip);  //wrapper conversion
        int b = 100/a;
        System.out.println(b);
        System.out.println("End of the Program");
    }
}
