package PhoneNumberBlocking;

/**
 * PhoneNumber Blocking
 * API: String substring(int beginIndex, int endIndex)
 * API: String substring(int beginIndex)
 * this API includes left but does not include right
 * 131 1234 9648 --> 131 **** 9648
 */

public class Main {
    public static void main(String[] args) {
        System.out.println("13112349648");
        System.out.println(hideNumber("13112349648"));
    }

    public static String hideNumber(String phoneNumber) {
        String showNumber = "";
        showNumber = phoneNumber.substring(0, 3) + "****" + phoneNumber.substring(7);
        return showNumber;
    }
}
