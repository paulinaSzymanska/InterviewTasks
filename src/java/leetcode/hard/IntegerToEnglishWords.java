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
//        System.out.println(numberToWords(123));
        System.out.println(numberToWords(12345));
    }

    public static String numberToWords(int num) {
        String[] split = String.valueOf(num).split("");
        StringBuilder result = new StringBuilder();

        Map<Integer, String> amountMap = new HashMap<>();
        amountMap.put(3, "Hundred");
        amountMap.put(4, "Thousand");
        amountMap.put(7, "Million");

        Map<String, String> doubleNumbers = new HashMap<>();
        doubleNumbers.put("2", "Twenty");
        doubleNumbers.put("3", "Thirty");
        doubleNumbers.put("4", "Forty");
        doubleNumbers.put("5", "Fifty");
        doubleNumbers.put("6", "Sixty");
        doubleNumbers.put("7", "Seventy");
        doubleNumbers.put("8", "Eighty");
        doubleNumbers.put("9", "Ninety");

        Map<String, String> singleNumbers = new HashMap<>();
        singleNumbers.put("0", "");
        singleNumbers.put("1", "One");
        singleNumbers.put("2", "Two");
        singleNumbers.put("3", "Three");
        singleNumbers.put("4", "Four");
        singleNumbers.put("5", "Fife");
        singleNumbers.put("6", "Six");
        singleNumbers.put("7", "Seven");
        singleNumbers.put("8", "Eight");
        singleNumbers.put("9", "Nine");

        for (int i = 0; i < split.length; i++) {
            if (i == 0) {
                result.append(singleNumbers.get(split[0])).append(" ");
                result.append(amountMap.get(split.length)).append(" ");
            } else if (i == (split.length - 2)) {
                result.append(doubleNumbers.get(split[i])).append(" ");
            } else if (i == (split.length - 1)) {
                result.append(singleNumbers.get(split[i])).append(" ");
            }
        }

        return String.valueOf(result);
    }
}
