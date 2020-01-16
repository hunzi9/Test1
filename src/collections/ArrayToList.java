package collections;

import java.util.Arrays;
import java.util.List;

public class ArrayToList {
    public static void main(String[] args) {
        String[] vowels = {"a","e","i","o","u"};

        List<String> vowelslist= Arrays.asList(vowels);
        System.out.println(vowelslist);

        for (Object vowel : vowelslist.toArray()) {
            System.out.print(vowel + " ");

        }
    }
}
