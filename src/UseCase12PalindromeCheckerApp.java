// File: src/UseCase12PalindromeCheckerApp.java

// Strategy Interface
interface PalindromeStrategy {
    boolean isPalindrome(String word);
}

// Stack-based strategy
class StackStrategy implements PalindromeStrategy {
    public boolean isPalindrome(String word) {
        java.util.Stack<Character> stack = new java.util.Stack<>();
        for (char c : word.toCharArray()) {
            stack.push(c);
        }
        for (char c : word.toCharArray()) {
            if (c != stack.pop()) return false;
        }
        return true;
    }
}

// Deque-based strategy
class DequeStrategy implements PalindromeStrategy {
    public boolean isPalindrome(String word) {
        java.util.Deque<Character> deque = new java.util.ArrayDeque<>();
        for (char c : word.toCharArray()) {
            deque.addLast(c);
        }
        while (deque.size() > 1) {
            if (!deque.removeFirst().equals(deque.removeLast())) return false;
        }
        return true;
    }
}

// Context class to inject strategy
class PalindromeContext {
    private PalindromeStrategy strategy;

    public PalindromeContext(PalindromeStrategy strategy) {
        this.strategy = strategy;
    }

    public boolean executeStrategy(String word) {
        return strategy.isPalindrome(word);
    }
}

public class UseCase12PalindromeCheckerApp {

    public static void main(String[] args) {
        System.out.println("====================================");
        System.out.println(" Welcome to Palindrome Checker App - UC12 ");
        System.out.println("====================================");

        String word = "level"; // hardcoded string

        // Step 1: Choose strategy dynamically
        PalindromeStrategy strategy = new StackStrategy(); // change to DequeStrategy() if needed
        PalindromeContext context = new PalindromeContext(strategy);

        // Step 2: Execute strategy
        boolean result = context.executeStrategy(word);

        // Step 3: Print result
        if (result) {
            System.out.println("The word \"" + word + "\" is a palindrome using "
                    + strategy.getClass().getSimpleName() + ".");
        } else {
            System.out.println("The word \"" + word + "\" is NOT a palindrome.");
        }

        System.out.println("Exiting UC12...");
    }
}