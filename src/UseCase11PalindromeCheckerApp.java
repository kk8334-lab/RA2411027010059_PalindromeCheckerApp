// File: src/UseCase11PalindromeCheckerApp.java

// PalindromeChecker class encapsulates palindrome logic
class PalindromeChecker {

    // Method to check if a string is palindrome using stack
    public boolean checkPalindrome(String word) {
        java.util.Stack<Character> stack = new java.util.Stack<>();

        for (int i = 0; i < word.length(); i++) {
            stack.push(word.charAt(i));
        }

        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) != stack.pop()) {
                return false;
            }
        }
        return true;
    }
}

public class UseCase11PalindromeCheckerApp {

    public static void main(String[] args) {
        System.out.println("====================================");
        System.out.println(" Welcome to Palindrome Checker App - UC11 ");
        System.out.println("====================================");

        String word = "deified"; // hardcoded string

        // Step 1: Use PalindromeChecker service
        PalindromeChecker checker = new PalindromeChecker();
        boolean result = checker.checkPalindrome(word);

        // Step 2: Print result
        if (result) {
            System.out.println("The word \"" + word + "\" is a palindrome.");
        } else {
            System.out.println("The word \"" + word + "\" is NOT a palindrome.");
        }

        System.out.println("Exiting UC11...");
    }
}