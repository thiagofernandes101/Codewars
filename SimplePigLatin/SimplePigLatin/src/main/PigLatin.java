package main;

import java.util.StringJoiner;
import java.util.regex.Pattern;

public class PigLatin {
    public static void main(String[] args) {
        System.out.println(pigIt("Pig latin is cool"));
    }

    public static String pigIt(String str) {
        String[] splitContent = str.split(" ");
        String result = formatWordContent(splitContent);
        return result;

        // Better solution
        // return str.replaceAll("(\\w)(\\w*)", "$2$1ay");
    }

    private static String formatWordContent(String[] content) {
        StringJoiner result = new StringJoiner(" ");

        for (String word : content) {
            String firstCharacter = String.valueOf(word.charAt(0));
            String formattedWord = word.substring(1).concat(firstCharacter);

            if (!isSpecialCharacter(formattedWord)) {
                formattedWord = formattedWord.concat("ay");
            }

            result.add(formattedWord);
        }

        return result.toString();
    }

    private static boolean isSpecialCharacter(String character) {
        String regexPattern = "^(?=.*[!@#&()–[{}]:;',?/*~$^+=<>])";
        Pattern pattern = Pattern.compile(regexPattern);
        return pattern.matcher(character).find();
    }
}
