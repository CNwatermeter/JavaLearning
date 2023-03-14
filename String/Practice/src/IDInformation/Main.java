package IDInformation;

/**
 * get the information of ID number
 * some digit has some implicit information
 */

public class Main {
    public static void main(String[] args) {
        //divide different block
        String idStr = "321281202001011234";
        String birthYearStr = idStr.substring(6, 10), birthMonth = idStr.substring(10, 12), birthDay = idStr.substring(12, 14);
        String genderStr = "";

        System.out.print("Birthday: ");
        System.out.println(birthYearStr + "." + birthMonth + "." + birthDay);

        //use ASCII code to judge the gender
        int gender = (int) (idStr.charAt(16) - '0');
        if (gender % 2 == 0) {
            genderStr = "Female";
        } else {
            genderStr = "Male";
        }
        System.out.println("Gender: " + genderStr);
    }
}
