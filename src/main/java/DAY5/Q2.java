//-Write a program to perform following operations on user entered strings and
//a character –
//i) Change the case of the string
//ii) Reverse the string
//iii) Compare two strings
//iv) Insert one string into another string
//v) Convert the string to upper case and lower case
//vi) Check whether the character is present in the string and at which position
//vii) Check whether the string is palindrome or not.
//viii) Check the number of word, vowel and consonant in the string
package DAY5;

import java.util.Scanner;
public class Q2 {

    // Change case
    public static String changeCase(String str) {
        StringBuilder sb = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (Character.isUpperCase(c)) {
                sb.append(Character.toLowerCase(c));
            } else if (Character.isLowerCase(c)) {
                sb.append(Character.toUpperCase(c));
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    // Reverse string
    public static String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    // Compare strings
    public static boolean compareStrings(String s1, String s2) {
        return s1.equals(s2);
    }

    // Insert string
    public static String insertString(String s1, String s2, int pos) {
        return s1.substring(0, pos) + s2 + s1.substring(pos);
    }

    // Convert cases
    public static void convertCases(String str) {
        System.out.println("Upper case: " + str.toUpperCase());
        System.out.println("Lower case: " + str.toLowerCase());
    }

    // Check character
    public static void checkCharacter(String str, char ch) {
        int pos = str.indexOf(ch);
        if (pos == -1) {
            System.out.println("Character '" + ch + "' not found.");
        } else {
            System.out.println("Character '" + ch + "' found at position: " + pos);
        }
    }

    // Palindrome check
    public static boolean isPalindrome(String str) {
        return str.equalsIgnoreCase(reverseString(str));
    }

    // Count words, vowels, consonants
    public static void countWordsVowelsConsonants(String str) {
        String[] words = str.trim().split("\\s+");
        int wordCount = words.length;

        int vowels = 0, consonants = 0;
        str = str.toLowerCase();
        for (char c : str.toCharArray()) {
            if (Character.isLetter(c)) {
                if ("aeiou".indexOf(c) != -1) {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }

        System.out.println("Words: " + wordCount);
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        int choice;
        do {
            System.out.println("--------------------------------------");
            System.out.println("\n--- String Operations Menu ---");
            System.out.println("1. Change case");
            System.out.println("2. Reverse string");
            System.out.println("3. Compare two strings");
            System.out.println("4. Insert one string into another");
            System.out.println("5. Convert to upper and lower case");
            System.out.println("6. Check character position");
            System.out.println("7. Check palindrome");
            System.out.println("8. Count words, vowels, consonants");
            System.out.println("9. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // consume newline
            System.out.println("--------------------------------------");

            switch (choice) {
                case 1:
                    System.out.println("Changed case: " + changeCase(str));
                    break;
                case 2:
                    System.out.println("Reversed string: " + reverseString(str));
                    break;
                case 3:
                    System.out.print("Enter another string to compare: ");
                    String str2 = sc.nextLine();
                    System.out.println("Strings equal? " + compareStrings(str, str2));
                    break;
                case 4:
                    System.out.print("Enter string to insert: ");
                    String insertStr = sc.nextLine();
                    System.out.print("Enter position: ");
                    int pos = sc.nextInt();
                    System.out.println("After insertion: " + insertString(str, insertStr, pos));
                    break;
                case 5:
                    convertCases(str);
                    break;
                case 6:
                    checkCharacter(str, ch);
                    break;
                case 7:
                    System.out.println("Is palindrome? " + isPalindrome(str));
                    break;
                case 8:
                    countWordsVowelsConsonants(str);
                    break;
                case 9:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 9);


        sc.close();
    }
}

