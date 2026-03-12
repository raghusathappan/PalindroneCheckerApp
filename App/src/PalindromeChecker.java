
public class PalindromeChecker {


    private static final String APP_NAME = "Palindrome Checker App";
    private static final String VERSION = "1.0.0";


    public static void main(String[] args) {

        displayWelcomeMessage();


        System.out.println("\nReady to validate palindromes...");


        System.out.println("------------------------------------");
        System.out.println("Thank you for using " + APP_NAME + "!");
    }


    private static void displayWelcomeMessage() {
        System.out.println("====================================");
        System.out.println("    Welcome to " + APP_NAME);
        System.out.println("    Version: " + VERSION);
        System.out.println("====================================");
    }
}