package main;

public class RgbToHex {
    public static void main(String[] args) {
        System.out.println(rgb(0, 0, 0));
        System.out.println(rgb(255, 255, 255));
        System.out.println(rgb(-20, 275, 125));
    }

    public static String rgb(int r, int g, int b) {
        r = Math.max(r, 0);
        r = Math.min(r, 255);

        g = Math.max(g, 0);
        g = Math.min(g, 255);

        b = Math.max(b, 0);
        b = Math.min(b, 255);

        String redAsHex = Integer.toHexString(r).toUpperCase();
        String greenAsHex = Integer.toHexString(g).toUpperCase();
        String blueAsHex = Integer.toHexString(b).toUpperCase();

        String result = formatHexMessage(redAsHex) + formatHexMessage(greenAsHex) + formatHexMessage(blueAsHex);

        return result;
    }

    private static String formatHexMessage(String hexValue) {
        return String.format("%1$" + 2 + "s", hexValue).replace(' ', '0');
    }
}
