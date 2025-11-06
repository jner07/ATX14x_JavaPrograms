package ex_22_Exceptions;

public class Lab003_TryandCatch {
    static void main() {
        String z = null;
        try {
            z.trim();
        } catch (Exception e) {
            System.out.println("String is null, cannot trim");  //we have handled the null pointer exception here
        }
    }
}
