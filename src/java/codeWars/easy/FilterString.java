package src.java.codeWars.easy;

import java.util.ArrayList;
import java.util.List;
//Given a list of strings, write a method that returns a list of all strings that start with the letter
//        'a' (lower case) and have exactly 3 letters. TIP: Use Java 8 Lambdas and Streams API's.

public class FilterString {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("AbCd");
        list.add("abc");
        list.add("aaa");
        list.add("bcd");
        list.add("adc");
        list.add("eeefg");
        System.out.println(search(list));
    }

    public static List<String> search(List<String> list) {
        return list.stream().filter(el -> el.startsWith("a")).filter(el -> el.length() == 3).toList();
    }
}
