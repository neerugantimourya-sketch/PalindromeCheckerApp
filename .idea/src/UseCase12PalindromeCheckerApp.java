import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class UseCase12PalindromeCheckerApp {

    // Step 1: Define Strategy Interface
    interface PalindromeStrategy {
        boolean check(String word);
    }

    // Step 2a: Stack Strategy Implementation
    static class StackStrategy implements PalindromeStrategy {
        public boolean check(String word) {
            Stack<Character> stack = new Stack<>();

            for (int i = 0; i < word.length(); i++) {
                stack.push(word.charAt(i));
            }

            String reversed = "";
            while (!stack.isEmpty()) {
                reversed = reversed + stack.pop();
            }

            return word.equals(reversed);
        }
    }

    // Step 2b: Deque Strategy Implementation
    static class DequeStrategy implements PalindromeStrategy {
        public boolean check(String word) {
            Deque<Character> deque = new ArrayDeque<>();

            for (int i = 0; i < word.length(); i++) {
                deque.addLast(word.charAt(i));
            }

            while (deque.size() > 1) {
                if (deque.removeFirst() != deque.removeLast()) {
                    return false;
                }
            }

            return true;
        }
    }

    // Step 3: Context class that uses strategy
    static class PalindromeChecker {
        private PalindromeStrategy strategy;

        PalindromeChecker(PalindromeStrategy strategy) {
            this.strategy = strategy;
        }

        public boolean check(String word) {
            return strategy.check(word);
        }
    }

    public static void main(String[] args) {

        // UC12: Strategy Pattern for Palindrome Algorithms
        String word = "madam";

        // Inject StackStrategy at runtime
        PalindromeChecker stackChecker = new PalindromeChecker(new StackStrategy());
        System.out.println("Using Stack Strategy:");
        System.out.println(word + (stackChecker.check(word) ? " is a Palindrome" : " is not a Palindrome"));

        // Inject DequeStrategy at runtime
        PalindromeChecker dequeChecker = new PalindromeChecker(new DequeStrategy());
        System.out.println("\nUsing Deque Strategy:");
        System.out.println(word + (dequeChecker.check(word) ? " is a Palindrome" : " is not a Palindrome"));
    }
}