// File: src/UseCase6PalindromeCheckerApp.java
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class UseCase6PalindromeCheckerApp {

    public static void main(String[] args) {
        System.out.println("====================================");
        System.out.println(" Welcome to Palindrome Checker App - UC6 ");
        System.out.println("====================================");

        String word = "madam"; // hardcoded string

        // Step 1: Enqueue characters in Queue (FIFO)
        Queue<Character> queue = new LinkedList<>();
        for (int i = 0; i < word.length(); i++) {
            queue.add(word.charAt(i));
        }

        // Step 2: Push characters into Stack (LIFO)
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < word.length(); i++) {
            stack.push(word.charAt(i));
        }

        // Step 3: Compare dequeue vs pop
        boolean isPalindrome = true;
        while (!queue.isEmpty()) {
            if (!queue.remove().equals(stack.pop())) {
                isPalindrome = false;
                break;
            }
        }

        // Step 4: Print result
        if (isPalindrome) {
            System.out.println("The word \"" + word + "\" is a palindrome.");
        } else {
            System.out.println("The word \"" + word + "\" is NOT a palindrome.");
        }

        System.out.println("Exiting UC6...");
    }
}