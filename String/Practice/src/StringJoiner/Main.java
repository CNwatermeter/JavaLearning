package StringJoiner;

import java.util.StringJoiner;

/**
 * StringJoiner
 * API: public StringJoiner(CharSequence delimiter)
 *      Constructs a StringJoiner with no characters in it, with no prefix or suffix,
 *      and a copy of the supplied delimiter
 * API: public StringJoiner(CharSequence delimiter, CharSequence prefix, CharSequence suffix)
 *      Constructs a StringJoiner with no characters in it
 *      using copies of the supplied prefix, delimiter and suffix
 * API: public StringJoiner add()
 * API: public int length()
 * API: public String toString()
 *      */
public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 1, 4, 5, 1, 4};
        System.out.println(splicingJoiner(arr));
    }
    public static String splicingJoiner(int[] arr) {
        StringJoiner sj = new StringJoiner(",", "[", "]");
        for (int i = 0; i < arr.length; i++) {
            sj = sj.add("" + arr[i]); //only String can be added
        }
        return sj.toString();
    }

}
