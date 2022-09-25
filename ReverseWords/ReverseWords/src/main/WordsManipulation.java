package main;

import java.util.ArrayList;
import java.util.List;

public class WordsManipulation {
    public static void main(String[] main) {
        System.out.println(reverseWords("The quick brown fox jumps over the lazy dog."));
        System.out.println(reverseWords("apple"));
    }

    public static String reverseWords(final String original) {
        if (original.isBlank() || original.isEmpty())
            return original;

        String[] words = original.split(" ");
        List<String> result = new ArrayList<>();

        for (String word : words) {
            result.add(reverseWordCharacters(word));
        }

        return String.join(" ", result);
    }

    private static String reverseWordCharacters(String word) {
        StringBuilder result = new StringBuilder();
        for (int index = word.length() - 1; index >= 0; index--) {
            result.append(word.charAt(index));
        }
        return result.toString();
    }
}
