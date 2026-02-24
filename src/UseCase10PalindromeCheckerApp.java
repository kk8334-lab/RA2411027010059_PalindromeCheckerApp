// File: src/UseCase10PalindromeCheckerApp.java
public class UseCase10PalindromeCheckerApp {

    public static void main(String[] args) {
        System.out.println("====================================");
        System.out.println(" Welcome to Palindrome Checker App - UC10 ");
        System.out.println("====================================");

        String word = "A man a plan a canal Panama"; // hardcoded string

        // Step 1: Normalize string (remove spaces, convert to lowercase)
        String normalized = word.replaceAll("\\s+", "").toLowerCase();

        // Step 2: Check palindrome using simple loop
        boolean isPalindrome = true;
        int n = normalized.length();
        for (int i = 0; i < n / 2; i++) {
            if (normalized.charAt(i) != normalized.charAt(n - i - 1)) {
                isPalindrome = false;
                break;
            }
        }

        // Step 3: Print result
        if (isPalindrome) {
            System.out.println("The phrase \"" + word + "\" is a palindrome (ignoring case and spaces).");
        } else {
            System.out.println("The phrase \"" + word + "\" is NOT a palindrome (ignoring case and spaces).");
        }

        System.out.println("Exiting UC10...");
    }
}
