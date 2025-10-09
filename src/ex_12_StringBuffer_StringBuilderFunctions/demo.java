package ex_12_StringBuffer_StringBuilderFunctions;

public class demo {
//    public class WordCount {
        public static void main(String[] args) {
            // Define the input string
            String sentence = "This is an example sentence to count words.";

            // Trim the string to remove leading and trailing spaces
            sentence = sentence.trim();

            // Split the string by one or more spaces using a regular expression
            String[] words = sentence.split("\\s+");

            // Count the number of words
            int wordCount = words.length;

            // Print the word count
            System.out.println("Number of words: " + wordCount);
        }
    }


