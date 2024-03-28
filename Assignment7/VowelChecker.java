import java.util.Scanner;

public class VowelChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine().toLowerCase(); // Convert to lowercase for case-insensitive comparison

        // Variables to store the count of vowels and a flag to check if any vowels are present
        int vowelCount = 0;
        boolean vowelPresent = false;

        // Iterate through each character of the string
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            // Check if the character is a vowel
            if (isVowel(ch)) {
                vowelCount++;
                vowelPresent = true;
            }
        }

        // Output whether any vowels are present and the total count of vowels
        if (vowelPresent) {
            System.out.println("Vowels are present in the string.");
            System.out.println("Total number of vowels: " + vowelCount);
        } else {
            System.out.println("No vowels are present in the string.");
        }

        scanner.close();
    }

    // Function to check if a character is a vowel
    public static boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}
