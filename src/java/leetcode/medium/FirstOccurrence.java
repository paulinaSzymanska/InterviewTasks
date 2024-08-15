package src.java.leetcode.medium;

/**
 * Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
 * <p>
 * Example 1:
 * <p>
 * Input: haystack = "sadbutsad", needle = "sad"
 * Output: 0
 * Explanation: "sad" occurs at index 0 and 6.
 * The first occurrence is at index 0, so we return 0.
 * Example 2:
 * <p>
 * Input: haystack = "leetcode", needle = "leeto"
 * Output: -1
 * Explanation: "leeto" did not occur in "leetcode", so we return -1.
 */
public class FirstOccurrence {
    public static void main(String[] args) {
//        System.out.println(strStr("sadbutsad", "sad"));
//        System.out.println(strStr("leetcode", "leeto"));
//        System.out.println(strStr("hello", "ll"));
        System.out.println(strStr("mississippi", "issipi"));
//        System.out.println(strStr("a", "a"));
//        System.out.println(strStr("abc", "c"));
    }

    public static int strStr(String haystack, String needle) {
        if (needle.length() > haystack.length()) {
            return -1;
        }
        if ((needle.length() == 1 && haystack.length() == 1) && (needle.charAt(0) == haystack.charAt(0))) {
            return 0;
        }
        for (int i = 0; i < haystack.length(); i++) {
            int needleLength = needle.length();
            if (haystack.charAt(i) == needle.charAt(0)) {
                for (int j = 0; j < needleLength; j++) {
                    if ((j + i) >= haystack.length()) {
                        return -1;
                    }
                    if (haystack.charAt(j + i) != needle.charAt(j)) {
                        break;
                    }

                    if (j == needleLength - 1) {
                        return i;
                    }
                }
            }
        }
        return -1;
    }
}
