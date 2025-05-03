public class ReverseString {
    public static void main(String[] args) {
        System.out.println(reverseString("Hello World!"));
        System.out.println(reverseString("Java Programming"));
        System.out.println(reverseString("OpenAI"));
        System.out.println(reverseString("1234567890"));
        System.out.println(reverseString("!@#$%^&*()"));

        // Convert the reversed string to lowercase and remove spaces
        String reversed = reverseString("Hello World!");
        String modified = reversed.toLowerCase().replace(" ", "");
        System.out.println(modified);
    }

    public static String reverseString(String str) {
        StringBuilder reversed = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }
        return reversed.toString();
    }
}
