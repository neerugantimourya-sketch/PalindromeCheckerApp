import java.util.Stack;

public class UseCase5PalindromeCheckerApp {

    public static void main(String[] args) {

        // UC5: Stack-Based Palindrome Checker
        String word = "madam";
        Stack<Character> stack = new Stack<>();

        // Push all characters into stack
        for (int i = 0; i < word.length(); i++) {
            stack.push(word.charAt(i));
        }

        // Pop characters and build reversed string
        String reversedWord = "";
        while (!stack.isEmpty()) {
            reversedWord = reversedWord + stack.pop();
        }

        if (word.equals(reversedWord)) {
            System.out.println(word + " is a Palindrome");
        } else {
            System.out.println(word + " is not a Palindrome");
        }
    }
}