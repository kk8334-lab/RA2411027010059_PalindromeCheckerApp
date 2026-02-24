// File: src/UseCase9PalindromeCheckerApp.java
public class UseCase9PalindromeCheckerApp {

    public static void main(String[] args) {
        System.out.println("====================================");
        System.out.println(" Welcome to Palindrome Checker App - UC9 ");
        System.out.println("====================================");

        String word = "level"; // hardcoded string

        // Step 1: Check palindrome using recursion
        boolean isPalindrome = isPalindromeRecursive(word, 0, word.length() - 1);

        // Step 2: Print result
        if (isPalindrome) {
            System.out.println("The word \"" + word + "\" is a palindrome.");
        } else {
            System.out.println("The word \"" + word + "\" is NOT a palindrome.");
        }

        System.out.println("Exiting UC9...");
    }

    // Recursive method to check palindrome
    public static boolean isPalindromeRecursive(String str, int start, int end) {
        if (start >= end) return true; // base condition
        if (str.charAt(start) != str.charAt(end)) return false; // mismatch
        return isPalindromeRecursive(str, start + 1, end - 1); // recursive call
    }
}