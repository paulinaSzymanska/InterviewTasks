package src.java.leetcode.hard;

import java.util.HashMap;
import java.util.Map;

/**
 * Convert a non-negative integer num to its English words representation.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: num = 123
 * Output: "One Hundred Twenty Three"
 * Example 2:
 * <p>
 * Input: num = 12345
 * Output: "Twelve Thousand Three Hundred Forty Five"
 * Example 3:
 * <p>
 * Input: num = 1234567
 * Output: "One Million Two Hundred Thirty Four Thousand Five Hundred Sixty Seven"
 */

public class IntegerToEnglishWords {
    public static void main(String[] args) {
        System.out.println(numberToWords(123));
    }

    public static String numberToWords(int num) {
        String value = String.valueOf(num);
        char firstNumber = 0;
        StringBuilder result = new StringBuilder();

        Map<String, String> map = new HashMap<>();
        map.put("1", "One");
        map.put("2", "Two");
        map.put("3", "Three");
        map.put("4", "Four");
        map.put("5", "Fife");
        map.put("6", "Six");
        map.put("7", "Seven");
        map.put("8", "Eight");
        map.put("9", "Nine");

        for (int i = 0; i < value.length(); i++) {
            firstNumber = value.charAt(0);
        }
        result.append(map.get(String.valueOf(firstNumber)));

        return String.valueOf(result);
    }
}
