package src.java.codeWars.easy;

//A palindrome is a word which reads the same backward or forward. 'abcba' is a palindrome.
//        Write a method that detects if a string is a palindrome.
//        Tip: Use word.charAt(i) to get the character at position i.
public class Palindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("eyte"));
        System.out.println(isPalindrome("abd"));
        System.out.println(isPalindrome("eye"));
        System.out.println(isPalindrome("eyye"));
    }

    public static boolean isPalindrome(String word) {
        int length = word.length();
        for (int i = 0; i < length / 2; i++) {
            if (word.charAt(i) != word.charAt(length - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
