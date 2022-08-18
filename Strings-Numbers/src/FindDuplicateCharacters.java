import java.util.Map;
import java.util.stream.Collectors;

/**
 * Find Duplicate Characters!
 */

public class FindDuplicateCharacters {

    public static void main(String[] args) {

        String str = """
                Buddy, you're a boy, make a big noise
                Playing in the street, gonna be a big man someday
                You got mud on your face, you big disgrace
                Kicking your can all over the place, singin'
                We will, we will rock you
                We will, we will rock you""";

        System.out.println(countDuplicateCharacters(str));

        //output:
        // {B=1, =5, K=1, P=1, W=2, Y=1,  =41, a=13, b=5, c=7, d=5, e=17, f=1, g=9, '=2, h=2, i=15, k=4,
        // l=12, ,=7, m=4, n=11,o=16, p=1, r=8, s=5, t=5, u=9, v=1, w=6, y=10}

    }

    private static Map<Character, Long> countDuplicateCharacters(String str) {

        return str.chars()
                .mapToObj(item -> (char) item)
                .collect(Collectors.groupingBy(item -> item, Collectors.counting()));
    }
}

