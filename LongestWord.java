import java.util.Scanner;

public class LongestWord {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter a string >>: ");
        String input = scanner.nextLine();
        String longestWord = longestWord(input);
        System.out.println("The longest word is: " + longestWord);
    }

    public static String longestWord(String str) {
        String[] words = str.split(" ");
        String longest = "";
        for (String word : words) {
            if (word.length() > longest.length()) {
                longest = word;
            }
        }
        return longest;
    }
}
