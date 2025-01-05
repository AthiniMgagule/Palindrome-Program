# Palindrome Program

This program provides multiple functionalities to work with palindromes, including checking words, numbers, and sentences for palindromes, and generating palindromic numbers within a specified range. The program is implemented in Java and operates through a simple text-based menu system.

## Features

1. **Check if a Word is a Palindrome**
   - Input a word, and the program will determine if it reads the same backward as forward, ignoring spaces, punctuation, and capitalization.

2. **Find Palindromes in a Paragraph**
   - Input a paragraph, and the program will extract and list all palindromic words within it.

3. **Check if a Number is a Palindrome**
   - Input a number, and the program will verify if it is a palindrome.

4. **Generate Palindromic Numbers within a Range**
   - Specify a range, and the program will generate all palindromic numbers within that range.

5. **Find the Longest Palindromic Substring** *(hidden feature)*
   - Includes a method to find the longest palindromic substring in a string, which can be used for further development.

## How to Use

1. **Compile and Run**:
   - Use the following commands to compile and run the program:
     ```bash
     javac Palindrome.java
     java Palindrome
     ```

2. **Choose an Option**:
   - After running the program, you will be prompted with a menu:
     ```
     Choose an option:
     1. Check if a word is a palindrome
     2. Find palindromes in a paragraph
     3. Check if a number is a palindrome
     4. Generate palindromic numbers within a range
     ```

3. **Input Values**:
   - Based on the selected option, provide the necessary input (word, paragraph, number, or range).

## Example Usage

### Option 1: Check if a Word is a Palindrome
Input:
```
Enter a word to check if it is a palindrome: radar
```
Output:
```
Is the word a palindrome? true
```

### Option 2: Find Palindromes in a Paragraph
Input:
```
Enter a paragraph to find palindromes: Madam Anna lives in a civic house with a kayak.
```
Output:
```
Palindromes found in the paragraph:
madam
anna
civic
kayak
```

### Option 3: Check if a Number is a Palindrome
Input:
```
Enter a number to check if it is a palindrome: 12321
```
Output:
```
Is the number a palindrome? true
```

### Option 4: Generate Palindromic Numbers within a Range
Input:
```
Enter the start of the range: 10
Enter the end of the range: 50
```
Output:
```
Palindromic numbers within the range:
11
22
33
44
```

## Implementation Details

### Key Methods

1. **`CheckPalindrome(String word)`**:
   - Checks if the given word is a palindrome by reversing it and comparing it to the original.

2. **`cleanWord(String word)`**:
   - Removes non-alphanumeric characters and converts the string to lowercase.

3. **`findPalindromes(String paragraph)`**:
   - Splits a paragraph into words and identifies palindromic words.

4. **`generatePalindromicNumbers(int start, int end)`**:
   - Generates and prints all palindromic numbers within a specified range.

5. **`longestPalindrome(String s)`**:
   - Finds the longest palindromic substring in a string (not used in the menu but available for further use).

### Tools and Techniques
- Regular Expressions (`replaceAll`) for cleaning input.
- String manipulation for reversing and checking palindromes.
- ArrayLists for dynamically storing palindromic words.
- Loops for generating and validating palindromic numbers.

## Future Enhancements

- Add support for case-sensitive palindrome checking.
- Integrate a graphical user interface (GUI).
- Extend functionality to find palindromes in multiple languages.

## Author
This program was written as an example of working with strings and numbers in Java, showcasing the use of regular expressions, string manipulation, and user input handling.

Feel free to modify and enhance this program for your needs!

