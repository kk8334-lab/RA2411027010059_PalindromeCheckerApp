// File: src/UseCase7PalindromeCheckerApp.java
import java.util.ArrayDeque;
import java.util.Deque;

public class UseCase7PalindromeCheckerApp {

    public static void main(String[] args) {
        System.out.println("====================================");
        System.out.println(" Welcome to Palindrome Checker App - UC7 ");
        System.out.println("====================================");

        String word = "racecar"; // hardcoded string

        // Step 1: Insert characters into Deque
        Deque<Character> deque = new ArrayDeque<>();
        for (int i = 0; i < word.length(); i++) {
            deque.addLast(word.charAt(i));
        }

        // Step 2: Compare front and rear elements
        boolean isPalindrome = true;
        while (deque.size() > 1) {
            if (!deque.removeFirst().equals(deque.removeLast())) {
                isPalindrome = false;
                break;
            }
        }

        // Step 3: Print result
        if (isPalindrome) {
            System.out.println("The word \"" + word + "\" is a palindrome.");
        } else {
            System.out.println("The word \"" + word + "\" is NOT a palindrome.");
        }

        System.out.println("Exiting UC7...");
    }
}