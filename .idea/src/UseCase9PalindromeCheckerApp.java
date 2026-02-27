public class UseCase9PalindromeCheckerApp {

    // Recursive method to check palindrome
    static boolean isPalindrome(String word, int start, int end) {

        // Base condition
        if (start >= end) {
            return true;
        }

        // Compare first and last characters
        if (word.charAt(start) != word.charAt(end)) {
            return false;
        }

        // Recursive call moving inward
        return isPalindrome(word, start + 1, end - 1);
    }

    public static void main(String[] args) {

        // UC9: Recursive Palindrome Checker
        String word = "madam";

        boolean result = isPalindrome(word, 0, word.length() - 1);

        if (result) {
            System.out.println(word + " is a Palindrome");
        } else {
            System.out.println(word + " is not a Palindrome");
        }
    }
}