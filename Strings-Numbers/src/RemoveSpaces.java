/**
 * Remove spaces!
 */

public class RemoveSpaces {

    public static void main(String[] args) {

        String str = "One, Two, Three, Four, Five";

        System.out.println(removeSpace(str));
    }

    private static String removeSpace(String str) {
        return str.replaceAll("\s", "");
    }
}
