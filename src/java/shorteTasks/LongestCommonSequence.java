package src.java.shorteTasks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

//Given two strings, write a method that finds the longest common sub-sequence.
public class LongestCommonSequence {
    public static void main(String[] args) {
        System.out.println(findLongestCommonSequence("asd", "a"));
        System.out.println(findLongestCommonSequence("rtax", "tap"));
        System.out.println(findLongestCommonSequence("AdotodoX", "otodoC"));
        System.out.println(findLongestCommonSequence("djefhsdkjTOTo", "sdhfjshdfjsTOTO"));
    }

    public static String findLongestCommonSequence(String s1, String s2) {
        List<List<Character>> listOfLongestSameLetters = new ArrayList<>();
        for (int i = 0; i < s1.length(); i++) {
            for (int j = 0; j < s2.length(); j++) {
                char firstOne = s1.charAt(i);
                char secondOne = s2.charAt(j);
                if (firstOne == secondOne) {
                    listOfLongestSameLetters.add(listOfSameLetters(s1, s2, i, j));
                }
            }
        }
        List<Character> longestList = listOfLongestSameLetters.stream()
                .max(Comparator.comparingInt(List::size))
                .orElse(Collections.emptyList());

        String result = longestList.stream()
                .map(String::valueOf)
                .collect(Collectors.joining());

        return result;
    }

    private static List<Character> listOfSameLetters(String s1, String s2, int i, int j) {
        List<Character> list = new ArrayList<>();
        for (int k = i; k < s1.length(); k++) {
            for (int l = j; l < s2.length(); l++) {
                if (k == s1.length()) {
                    return list;
                } else {
                    char first = s1.charAt(k);
                    char second = s2.charAt(l);
                    if (first == second) {
                        list.add(first);
                        k++;
                    } else return list;
                }
            }
        }
        return list;
    }
}

