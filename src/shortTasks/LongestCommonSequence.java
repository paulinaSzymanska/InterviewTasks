package src.shortTasks;

import java.util.ArrayList;
import java.util.List;

//Given two strings, write a method that finds the longest common sub-sequence.
public class LongestCommonSequence {
    public static void main(String[] args) {
//        System.out.println(findLongestCommonSequence("asd", "a"));
//        System.out.println(findLongestCommonSequence("tax", "tap"));
//        System.out.println(findLongestCommonSequence("otodoX", "otodoC"));
        System.out.println(findLongestCommonSequence("XdsfsdtOTO", "sdhfjshdfjsTOTO"));
    }
    public static String findLongestCommonSequence(String s1, String s2) {
        List<Character> list = new ArrayList<>();
        for (int i = 0; i < s1.length(); i++) {
            for (int j = 0; j < s2.length(); j++) {
                char firstOne = s1.charAt(i);
                char secondOne = s2.charAt(j);

                if (firstOne == secondOne) {
                    System.out.println( firstOne + " SAME with: " + secondOne);
                }
            }

        }
    return "";
    }
}
