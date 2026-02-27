public class UseCase10PalindromeCheckerApp {

    public static void main(String[] args) {

        // UC10: Case-Insensitive & Space-Ignored Palindrome
        String word = "A man a plan a canal Panama";

        // Step 1: Normalize - remove spaces and convert to lowercase
        String normalized = word.replaceAll("\\s+", "").toLowerCase();

        // Step 2: Check palindrome using two-pointer
        int start = 0;
        int end = normalized.length() - 1;
        boolean isPalindrome = true;

        while (start < end) {
            if (normalized.charAt(start) != normalized.charAt(end)) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        // Step 3: Display result
        System.out.println("Original  : " + word);
        System.out.println("Normalized: " + normalized);

        if (isPalindrome) {
            System.out.println(word + " is a Palindrome");
        } else {
            System.out.println(word + " is not a Palindrome");
        }
    }
}