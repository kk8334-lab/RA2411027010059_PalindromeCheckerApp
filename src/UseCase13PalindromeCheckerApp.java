// File: src/UseCase13PalindromeCheckerApp.java

public class UseCase13PalindromeCheckerApp {

    public static void main(String[] args) {
        System.out.println("====================================");
        System.out.println(" Welcome to Palindrome Checker App - UC13 ");
        System.out.println("====================================");

        String word = "A man a plan a canal Panama".replaceAll("\\s+", "").toLowerCase();

        // Stack-based approach
        long startStack = System.nanoTime();
        boolean stackResult = stackPalindrome(word);
        long endStack = System.nanoTime();

        // Loop-based approach
        long startLoop = System.nanoTime();
        boolean loopResult = loopPalindrome(word);
        long endLoop = System.nanoTime();

        // Recursive approach
        long startRec = System.nanoTime();
        boolean recResult = recursivePalindrome(word, 0, word.length() - 1);
        long endRec = System.nanoTime();

        // Display results
        System.out.println("Results:");
        System.out.println("Stack Approach: " + stackResult + ", Time: " + (endStack - startStack) + " ns");
        System.out.println("Loop Approach: " + loopResult + ", Time: " + (endLoop - startLoop) + " ns");
        System.out.println("Recursive Approach: " + recResult + ", Time: " + (endRec - startRec) + " ns");

        System.out.println("Exiting UC13...");
    }

    // Stack-based palindrome
    public static boolean stackPalindrome(String str) {
        java.util.Stack<Character> stack = new java.util.Stack<>();
        for (char c : str.toCharArray()) stack.push(c);
        for (char c : str.toCharArray()) {
            if (c != stack.pop()) return false;
        }
        return true;
    }

    // Loop-based palindrome
    public static boolean loopPalindrome(String str) {
        int n = str.length();
        for (int i = 0; i < n / 2; i++) {
            if (str.charAt(i) != str.charAt(n - i - 1)) return false;
        }
        return true;
    }

    // Recursive palindrome
    public static boolean recursivePalindrome(String str, int start, int end) {
        if (start >= end) return true;
        if (str.charAt(start) != str.charAt(end)) return false;
        return recursivePalindrome(str, start + 1, end - 1);
    }
}