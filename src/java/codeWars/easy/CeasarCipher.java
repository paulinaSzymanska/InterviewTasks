package src.java.codeWars.easy;

import java.util.ArrayList;

//The Ceasar cipher is a basic encryption technique used by Julius Ceasar to securely communicate with his generals.
// Each letter is replaced by another letter N positions down the english alphabet. For example, for a rotation of 5,
// the letter 'c' would be replaced by an 'h'. In case of a 'z', the alphabet rotates and it is transformed into a 'd'.
//        Implement a decoder for the Ceasar cipher where N = 5.
//        TIP: Use code.toCharArray() to get an array of characters.
public class CeasarCipher {
    private static final ArrayList<Character> list = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println(decode("yes"));
    }

    public static String decode(String code) {
        addAlphabetToList();
        int n = 5;
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < code.length(); i++) {
            char c = code.charAt(i);
            int indexOfObject = list.indexOf(c);
            int newIndexOfObject = indexOfObject + n;
            if (newIndexOfObject > list.size()) {
                int newSize = newIndexOfObject - list.size();
                result.append(list.get(newSize));
            } else {
                result.append(list.get(newIndexOfObject));
            }
        }
        return result.toString();
    }

    public static void addAlphabetToList() {
        for (char sign = 'a'; sign <= 'z'; sign++) {
            list.add(sign);
        }
    }
}
