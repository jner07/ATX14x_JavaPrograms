
import java.util.LinkedHashSet;

public static String Lab11_RemoveDuplicates (String str){

    LinkedHashSet<Character> set = new LinkedHashSet<>();

        for (int i = 0; i < str.length(); i++) {
        set.add(str.charAt(i)); // Duplicates are automatically ignored
    }

    // Build result string from set
    StringBuilder result = new StringBuilder();
        for (char ch : set) {
        result.append(ch);
    }
        return result.toString();
}

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a string: ");
    String input = sc.nextLine();

    System.out.println("\n--- Results ---");
    System.out.println(Lab11_RemoveDuplicates(input));

}





