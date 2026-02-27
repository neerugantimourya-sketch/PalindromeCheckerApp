public class UseCase2PalindromeCheckerApp {
    public static void main(String[] args) {

        // UC2: Hardcoded Palindrome Check
        String word = "madam";
        String reversedWord = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            reversedWord = reversedWord + word.charAt(i);
        }

        if (word.equals(reversedWord)) {
            System.out.println(word + " is a Palindrome");
        } else {
            System.out.println(word + " is not a Palindrome");
        }

    }
}

