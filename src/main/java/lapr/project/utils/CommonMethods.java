package lapr.project.utils;

public class CommonMethods {

    private static final double LAT_MAX = 90;
    private static final double LAT_MIN = -90;
    private static final double LON_MAX = 180;
    private static final double LON_MIN = -180;

    /***
     *  Check if a string contains alphanumerical characters
     * @param name
     * @return if it was successfully added to the store (true or false)
     */
    public static boolean stringHaveAlphanumerical(String name) {
        for (int i = 0; i < name.length(); i++) {
            char ch = name.charAt(i);
            if (Character.isLetterOrDigit(ch) || ch == ' ') {
                continue;
            }
            return false;
        }
        return true;
    }

    /**
     * Method that checks is a string just have letters
     * @param letter
     * @return
     */
    public static boolean checkIfStringJustHaveLetters(String letter) {
        int counter = 0;
        for (int i = 0; i < letter.length(); i++) {
            if (Character.isLetter(letter.charAt(i))) {
                counter++;
            } else {
                return false;
            }
        }
        return counter == letter.length();
    }

    /**
     * Method that checks if a string just have numbers
     * @param number
     * @return
     */
    public static boolean checkIfStringJustHaveNumbers(String number) {
        int counter = 0;
        for (int i = 0; i < number.length(); i++) {
            if (Character.isDigit(number.charAt(i))) {
                counter++;
            } else {
                return false;
            }
        }
        return counter == number.length();
    }

    /**
     * Method that checks if a given latitude is valid
     * @param latitude
     * @return true/false
     */
    public static boolean isValidLatitude(double latitude) {
        return latitude <= LAT_MAX && latitude >= LAT_MIN;
    }

    /**
     * Method that checks if a given longitude is valid
     * @param longitude
     * @return true/false
     */
    public static boolean isValidLongitude(double longitude) {
        return longitude <= LON_MAX && longitude >= LON_MIN;
    }
}
