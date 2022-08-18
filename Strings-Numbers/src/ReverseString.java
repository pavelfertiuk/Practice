/**
 * Reverse String!
 */

public class ReverseString {

    public static void main(String[] args) {

        String str = "Reverse String";

        System.out.println(reverseString(str));

        //output: gnirtS esreveR
    }

    private static String reverseString(String str) {

        return new StringBuilder(str).reverse().toString();
    }
}
