package CharacterReplacement;

/**
 * Character replacement
 * API: String replace(char oldValue, char newValue)
 * replace all the A to *
 */

public class Main {
    public static void main(String[] args) {
        String oldStr = "AIASBSBHVAJDCQAQDA";
        //demo info
        String newStr = oldStr;
        String[] replacement = {"A", "B", "C" };
        //use a 'database' to replace all the value we have to change
        for (int i = 0; i < replacement.length; i++) {
            newStr = newStr.replace(replacement[i], "*");
        }
        System.out.println(oldStr);
        System.out.println(newStr);
    }
}
