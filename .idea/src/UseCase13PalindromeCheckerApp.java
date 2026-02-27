import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class UseCase13PalindromeCheckerApp {

    // Approach 1: String Reverse using Loop
    static boolean checkUsingLoop(String word) {
        String reversed = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reversed = reversed + word.charAt(i);
        }
        return word.equals(reversed);
    }

    // Approach 2: Two Pointer using char[]
    static boolean checkUsingTwoPointer(String word) {
        char[] chars = word.toCharArray();
        int start = 0;
        int end = chars.length - 1;
        while (start < end) {
            if (chars[start] != chars[end]) return false;
            start++;
            end--;
        }
        return true;
    }

    // Approach 3: Stack Based
    static boolean checkUsingStack(String word) {
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

    // Approach 4: Deque Based
    static boolean checkUsingDeque(String word) {
        Deque<Character> deque = new ArrayDeque<>();
        for (int i = 0; i < word.length(); i++) {
            deque.addLast(word.charAt(i));
        }
        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) return false;
        }
        return true;
    }

    // Approach 5: Recursive
    static boolean checkUsingRecursion(String word, int start, int end) {
        if (start >= end) return true;
        if (word.charAt(start) != word.charAt(end)) return false;
        return checkUsingRecursion(word, start + 1, end - 1);
    }

    public static void main(String[] args) {

        // UC13: Performance Comparison
        String word = "amanaplanacanalpanama";
        long startTime, endTime;

        System.out.println("==========================================");
        System.out.println("     Performance Comparison Results      ");
        System.out.println("==========================================");

        // Approach 1: Loop
        startTime = System.nanoTime();
        checkUsingLoop(word);
        endTime = System.nanoTime();
        System.out.println("Loop Approach       : " + (endTime - startTime) + " ns");

        // Approach 2: Two Pointer
        startTime = System.nanoTime();
        checkUsingTwoPointer(word);
        endTime = System.nanoTime();
        System.out.println("Two Pointer Approach: " + (endTime - startTime) + " ns");

        // Approach 3: Stack
        startTime = System.nanoTime();
        checkUsingStack(word);
        endTime = System.nanoTime();
        System.out.println("Stack Approach      : " + (endTime - startTime) + " ns");

        // Approach 4: Deque
        startTime = System.nanoTime();
        checkUsingDeque(word);
        endTime = System.nanoTime();
        System.out.println("Deque Approach      : " + (endTime - startTime) + " ns");

        // Approach 5: Recursive
        startTime = System.nanoTime();
        checkUsingRecursion(word, 0, word.length() - 1);
        endTime = System.nanoTime();
        System.out.println("Recursive Approach  : " + (endTime - startTime) + " ns");

        System.out.println("==========================================");
    }
}