public class UseCase3PalindromeCheckerApp {
    public static void main(String[] args) {

        // UC3: Palindrome Check Using String Reverse
        String word = "racecar";
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

