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
}
