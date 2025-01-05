# Palindrome Program

## Overview
This Java program provides a variety of features related to palindromes, allowing users to:

1. Check if a word is a palindrome.
2. Find palindromes in a paragraph.
3. Check if a number is a palindrome.
4. Generate palindromic numbers within a range.
5. Find the longest palindromic substring in a string.
6. Find all palindromic substrings in a string.

## How It Works
When you run the program, you will be presented with a menu of options. Simply select the number corresponding to the operation you wish to perform, and follow the prompts to provide input.

## Features
### 1. Check if a Word is a Palindrome
- **Description:** Prompts the user to enter a word and checks whether it reads the same backward as forward.
- **Input Example:** `radar`
- **Output Example:** `Is the word a palindrome? true`

### 2. Find Palindromes in a Paragraph
- **Description:** Takes a paragraph and identifies all the palindromic words within it.
- **Input Example:** `Madam Arora teaches malayalam.`
- **Output Example:**
  ```
  Palindromes found in the paragraph:
  madam
  arora
  malayalam
  ```

### 3. Check if a Number is a Palindrome
- **Description:** Prompts the user to enter a number and determines if it is a palindrome.
- **Input Example:** `12321`
- **Output Example:** `Is the number a palindrome? true`

### 4. Generate Palindromic Numbers Within a Range
- **Description:** Asks for a range (start and end) and prints all palindromic numbers within that range.
- **Input Example:** Start: `10`, End: `200`
- **Output Example:**
  ```
  Palindromic numbers within the range:
  11
  22
  33
  ...
  191
  ```

### 5. Find the Longest Palindromic Substring in a String
- **Description:** Identifies the longest substring within a given string that is a palindrome.
- **Input Example:** `babad`
- **Output Example:** `The longest palindromic substring is: bab`

### 6. Find All Palindromic Substrings in a String
- **Description:** Finds and lists all palindromic substrings in the given input string.
- **Input Example:** `aaa`
- **Output Example:**
  ```
  Palindromic substrings found:
  a
  aa
  aaa
  ```

## Code Structure
### Main Class: `Palindrome`
- Handles the menu and user input.
- Calls appropriate methods based on user choice.

### Methods:
1. `CheckPalindrome(String word)`: Checks if a given string is a palindrome.
2. `cleanWord(String word)`: Cleans a string by removing non-alphanumeric characters and converting to lowercase.
3. `reverse(String s)`: Reverses the input string.
4. `findPalindromes(String paragraph)`: Extracts palindromic words from a paragraph.
5. `generatePalindromicNumbers(int start, int end)`: Prints all palindromic numbers within a range.
6. `longestPalindrome(String s)`: Finds the longest palindromic substring in a string.
7. `findAllPalindromicSubstrings(String s)`: Identifies all palindromic substrings in a string.
8. `expandAroundCenter(String s, int left, int right, Set<String> palindromes)`: Helper method to identify substrings that are palindromes.

## Example Usage
1. Compile the program:
   ```
   javac Palindrome.java
   ```
2. Run the program:
   ```
   java Palindrome
   ```
3. Follow the on-screen menu to interact with the program.

## Requirements
- Java Development Kit (JDK) installed on your system.
- Basic knowledge of running Java programs from the command line.

## Notes
- This program ignores case and special characters when checking for palindromes.
- It efficiently identifies palindromic substrings using the center expansion technique.

Feel free to explore the code and adapt it to your needs!
