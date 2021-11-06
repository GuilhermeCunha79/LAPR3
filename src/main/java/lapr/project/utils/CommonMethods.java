package lapr.project.utils;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.List;

public class CommonMethods {


    private CommonMethods() {
        throw new IllegalStateException("Utility class");
    }

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

    public static void serializeStore(List<?> list, String path) {
        try (FileOutputStream out = new FileOutputStream(path); ObjectOutputStream outputStream = new ObjectOutputStream(out)) {
            outputStream.writeObject(list);
        } catch (IOException e) {
            e.getLocalizedMessage();
        }
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
        return latitude <= Constants.LAT_MAX && latitude >= Constants.LAT_MIN;
    }

    /**
     * Method that checks if a given longitude is valid
     * @param longitude
     * @return true/false
     */
    public static boolean isValidLongitude(double longitude) {
        return longitude <= Constants.LON_MAX && longitude >= Constants.LON_MIN;
    }
}
