/**
 * A utility class providing string conversion, unit conversion, and text processing methods.
 * This class cannot be instantiated and contains only static utility methods.
 */
public class CampbellClass {

    /**
     * Private constructor to prevent instantiation.
     * This is a utility class meant to be used via static methods only.
     */
    private CampbellClass() {
        // Utility class - no instances allowed!
    }

    // ===== STRING CONVERSION METHODS =====
    
    /**
     * Converts an integer value to its string representation.
     *
     * @param value the integer value to convert
     * @return the string representation of the integer
     */
    public static String convertString(int value) {
        return String.valueOf(value);
    }
    
    /**
     * Converts a double value to its string representation.
     *
     * @param value the double value to convert
     * @return the string representation of the double
     */
    public static String convertString(double value) {
        return String.valueOf(value);
    }
    
    /**
     * Converts a character to its string representation.
     *
     * @param value the character to convert
     * @return the string representation of the character
     */
    public static String convertString(char value) {
        return String.valueOf(value);
    }
    
    /**
     * Converts a boolean value to its string representation.
     *
     * @param value the boolean value to convert
     * @return the string representation of the boolean ("true" or "false")
     */
    public static String convertString(boolean value) {
        return String.valueOf(value);
    }

    // ===== UNIT CONVERSION METHODS =====
    
    /**
     * Converts meters to centimeters (integer version).
     *
     * @param meters the length in meters
     * @return the equivalent length in centimeters
     */
    public static int convertMetersToCenti(int meters) {
        return meters * 100;
    }
    
    /**
     * Converts meters to centimeters (double version).
     *
     * @param meters the length in meters
     * @return the equivalent length in centimeters
     */
    public static double convertMetersToCenti(double meters) {
        return meters * 100.0;
    }

    // ===== TEXT PROCESSING METHODS =====
    
    /**
     * Removes all non-alphabetic characters from a string while preserving original case.
     *
     * @param text the input string to process
     * @return a string containing only letters from the original text, or empty string if input is null
     */
    public static String removeNonAlpha(String text) {
        if (text == null) return "";
        return text.replaceAll("[^a-zA-Z]", "");
    }
    
    /**
     * Removes all non-alphabetic characters from a string with optional case conversion.
     *
     * @param text the input string to process
     * @param toUpperCase if true, converts result to uppercase; if false, converts to lowercase
     * @return a string containing only letters with specified case, or empty string if input is null
     */
    public static String removeNonAlpha(String text, boolean toUpperCase) {
        if (text == null) return "";
        
        String result = text.replaceAll("[^a-zA-Z]", "");
        
        if (toUpperCase) {
            return result.toUpperCase();  // true = UPPERCASE
        } else {
            return result.toLowerCase();  // false = lowercase
        }
    }
}