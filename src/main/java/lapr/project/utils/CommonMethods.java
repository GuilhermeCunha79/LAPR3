package lapr.project.utils;

public class CommonMethods {
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
}
