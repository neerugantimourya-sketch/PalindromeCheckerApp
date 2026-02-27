public class UseCase11PalindromeCheckerApp {

    // Encapsulated PalindromeChecker class
    static class PalindromeChecker {

        // Single Responsibility - only checks palindrome
        public boolean checkPalindrome(String word) {

            String normalized = word.replaceAll("\\s+", "").toLowerCase();

            int start = 0;
            int end = normalized.length() - 1;

            while (start < end) {
                if (normalized.charAt(start) != normalized.charAt(end)) {
                    return false;
                }
                start++;
                end--;
            }
            return true;
        }
    }

    public static void main(String[] args) {

        // UC11: Object-Oriented Palindrome Service
        PalindromeChecker checker = new PalindromeChecker();

        String[] testWords = {"madam", "racecar", "hello", "level", "world"};

        for (String word : testWords) {
            if (checker.checkPalindrome(word)) {
                System.out.println(word + " is a Palindrome");
            } else {
                System.out.println(word + " is not a Palindrome");
            }
        }
    }
}