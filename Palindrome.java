import java.util.*;

public class Palindrome {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner sc = new Scanner(System.in);

        // Display menu options
        System.out.println("Choose an option:");
        System.out.println("1. Check if a word is a palindrome");
        System.out.println("2. Find palindromes in a paragraph");
        System.out.println("3. Check if a number is a palindrome");
        System.out.println("4. Generate palindromic numbers within a range");
        System.out.println("5. Find the longest palindromic substring in a string");
        System.out.println("6. Find all palindromic substrings in a string");

        // Read the user's choice
        int choice = sc.nextInt();
        sc.nextLine(); // Consume newline

        switch (choice) {
            case 1:
                // Prompt the user to enter a word
                System.out.println("Enter a word to check if it is a palindrome: ");
                String word = sc.nextLine();
                String cleanedWord = cleanWord(word);
                String myS[] = cleanedWord.split("[^a-zA-Z0-9]");
                String newWord = "";
                for(int i =0; i < myS.length; i++){
                    newWord += myS[i];
                }
                System.out.println("Is the word a palindrome? " + CheckPalindrome(newWord));
                break;

            case 2:
                // Prompt the user to enter a paragraph
                System.out.println("Enter a paragraph to find palindromes: ");
                String paragraph = sc.nextLine();
                String[] palindromes = findPalindromes(paragraph);
                System.out.println("Palindromes found in the paragraph:");
                for (String palindrome : palindromes) {
                    System.out.println(palindrome);
                }
                break;

            case 3:
                // Prompt the user to enter a number
                System.out.println("Enter a number to check if it is a palindrome: ");
                String number = sc.nextLine();
                String parts[] = number.split(", ");
                String newNumber = "";
                for(int i = 0; i < parts.length; i++){
                    newNumber += parts[i];
                }
                System.out.println("Is the number a palindrome? " + CheckPalindrome(newNumber));
                break;

            case 4:
                // Prompt the user to enter the range
                System.out.println("Enter the start of the range: ");
                int start = sc.nextInt();
                System.out.println("Enter the end of the range: ");
                int end = sc.nextInt();
                System.out.println("Palindromic numbers within the range:");
                generatePalindromicNumbers(start, end);
                break;

            case 5:
                // Prompt the user to enter a string
                System.out.println("Enter a string to find the longest palindromic substring: ");
                String inputString = sc.nextLine();
                String longestPalindrome = longestPalindrome(inputString);
                System.out.println("The longest palindromic substring is: " + longestPalindrome);
                break;

            case 6:
                // Prompt the user to enter a string
                System.out.println("Enter a string to find all palindromic substrings: ");
                String inputStr = sc.nextLine();
                String[] palindromicSubstrings = findAllPalindromicSubstrings(inputStr);
                System.out.println("Palindromic substrings found:");
                for (String palindrome : palindromicSubstrings) {
                    System.out.println(palindrome);
                }
                break;

            default:
                System.out.println("Invalid choice. Please try again.");
                break;
        }

        // Close the Scanner
        sc.close();
    }

    // Method to generate palindromic numbers within a range
    public static void generatePalindromicNumbers(int start, int end) {
        for (int i = start; i <= end; i++) {
            String numberStr = Integer.toString(i);
            if (CheckPalindrome(numberStr)) {
                System.out.println(i);
            }
        }
    }

    // Method to find the longest palindromic substring in a string
    public static String longestPalindrome(String s) {
        if (s == null || s.length() < 1) return "";
        int start = 0, end = 0;
        for (int i = 0; i < s.length(); i++) {
            int len1 = expandAroundCenter(s, i, i);
            int len2 = expandAroundCenter(s, i, i + 1);
            int len = Math.max(len1, len2);
            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }
        return s.substring(start, end + 1);
    }

    // Helper method for finding the longest palindromic substring
    private static int expandAroundCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1;
    }

    // Method to find all palindromic substrings in a string
    public static String[] findAllPalindromicSubstrings(String s) {
        Set<String> palindromes = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            // Odd length palindromes
            expandAndCollectPalindromes(s, i, i, palindromes);
            // Even length palindromes
            expandAndCollectPalindromes(s, i, i + 1, palindromes);
        }
        return palindromes.toArray(new String[0]);
    }

    // Helper method to expand around center and collect palindromes
    private static void expandAndCollectPalindromes(String s, int left, int right, Set<String> palindromes) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            palindromes.add(s.substring(left, right + 1));
            left--;
            right++;
        }
    }

    // Method to find palindromes in a paragraph
    public static String[] findPalindromes(String paragraph) {
        String[] words = paragraph.split(" ");
        ArrayList<String> palindromes = new ArrayList<String>();
        for (String word : words) {
            String cleanedWord = cleanWord(word);
            if (CheckPalindrome(cleanedWord)) {
                palindromes.add(cleanedWord);
            }
        }
        String[] palindromeArray = new String[palindromes.size()];
        return palindromes.toArray(palindromeArray);
    }

    // Method to check if the word is a palindrome
    public static boolean CheckPalindrome(String word) {
        String reverse = reverse(word);
        return reverse.equals(word);
    }

    // Method to reverse the word
    public static String reverse(String s) {
        return new StringBuilder(s).reverse().toString();
    }

    // Method to clean the word
    public static String cleanWord(String word) {
        return word.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
    }
}