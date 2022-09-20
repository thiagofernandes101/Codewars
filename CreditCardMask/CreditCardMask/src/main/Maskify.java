package main;

public class Maskify {
    public static String maskify(String message) {
        String maskedMessage = "";

        if (message == "" || message.length() < 5) {
            return message;
        }

        String lastFourCharacters = message.substring(message.length() - 4);
        maskedMessage = "#".repeat(message.length() - 4) + lastFourCharacters;
        return maskedMessage;
    }
}
