package main;

public class WhoLikesIt {
    public static void main(String[] args) {
        System.out.println(showIt());
        System.out.println(showIt("Peter"));
        System.out.println(showIt("Jacob", "Alex"));
        System.out.println(showIt("Jacob", "Alex", "Mark"));
        System.out.println(showIt("Jacob", "Alex", "Mark", "Max"));
    }

    public static String showIt(String... names) {
        return switch (names.length) {
            case 0 -> "no one likes this";
            case 1 -> String.format("%s likes this", names[0]);
            case 2 -> String.format("%s and %s like this", names[0], names[1]);
            case 3 -> String.format("%s, %s and %s like this", names[0], names[1], names[2]);
            default -> String.format("%s, %s and %d others like this", names[0], names[1], names.length - 2);
        };
    }
}
