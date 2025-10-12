package ex_12_StringBuffer_StringBuilderFunctions;

public class demo {
//        public static void main(String[] args) {
static void main() {
     // Define the input string
            String sentence = "This is an example sentence to count words.";

            // Trim the string to remove leading and trailing spaces
            sentence = sentence.trim();

            // Split the string by one or more spaces using a regular expression
            String[] words = sentence.split("\\s+");
//            System.out.println(words);

//            // Count the number of words
            int wordCount = words.length;
    System.out.println(wordCount);

//            // Print the word count
//            System.out.println("Number of words: " + wordCount);
        }
    }


