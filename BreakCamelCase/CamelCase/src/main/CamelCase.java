package main;

public class CamelCase {
    public static void main(String[] args) {
        System.out.println(breakInput("Teste"));
        System.out.println(breakInput("camelCasing"));
        System.out.println(breakInput("camelCasingTest"));
        System.out.println(breakInput("camelcasingtest"));
        System.out.println(breakInput("identifier"));
        System.out.println(breakInput(""));
    }

    public static String breakInput(String input) {
        String result = input.replaceAll("\\d+", "").replaceAll("(.)([A-Z])", "$1 $2");
        return result;
    }
}
