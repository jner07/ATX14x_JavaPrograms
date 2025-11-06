package ex_21_WrapperClass;

public class Lab003_WrapperConversion {
    static void main() {
        String num = "10";      //only numbers in string can be converted into integer
        int aa = 10;

        //String to wrapper conversion
        Integer a = Integer.parseInt(num); //parseInt will convert the string into integer

//        Double.parseDouble();
//        Float.parseFloat();
//        Long.parseLong();

        //String to Primitive
        int ap = Integer.parseInt(num);

        //String to Wrapper
        Integer aa3 = Integer.valueOf("10");
        System.out.println(aa3);
    }
}
