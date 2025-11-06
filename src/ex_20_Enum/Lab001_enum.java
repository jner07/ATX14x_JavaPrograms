package ex_20_Enum;

public class Lab001_enum {
    static void main() {
        System.out.println(day.jayesh); //enum declared outside main method below can be called directly here
        System.out.println(enumclass1.bye); //this is calling from enum class enumclass1
    }

    enum day{
        saturday, sunday, monday, tuesday, wednesday, jayesh, thursday, friday
    }
}
