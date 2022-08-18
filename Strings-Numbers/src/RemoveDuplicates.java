import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * Remove Duplicates!
 */

public class RemoveDuplicates {

    public static void main(String[] args) {

        String str = "aaabbbccc";

        System.out.println(removeDuplicates(str));

        //output: abc
    }

    public static String removeDuplicates(String str) {
        return Arrays.stream(str.split(""))
                .distinct ()
                .collect(Collectors.joining());
    }
}
