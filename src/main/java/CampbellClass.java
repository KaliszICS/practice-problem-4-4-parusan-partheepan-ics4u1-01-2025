public class CampbellClass {

    // Private constructor to prevent instantiation
    private CampbellClass() {
        // Utility class - no instances allowed!
    }

    // 1. convertString - converts different types to String
    public static String convertString(int value) {
        return String.valueOf(value);
    }
    
    public static String convertString(double value) {
        return String.valueOf(value);
    }
    
    public static String convertString(char value) {
        return String.valueOf(value);
    }
    
    public static String convertString(boolean value) {
        return String.valueOf(value);
    }

    // 2. convertMetersToCenti - converts meters to centimeters
    public static int convertMetersToCenti(int meters) {
        return meters * 100;
    }
    
    public static double convertMetersToCenti(double meters) {
        return meters * 100.0;
    }

    // 3. removeNonAlpha - removes non-letter characters
    public static String removeNonAlpha(String text) {
        // Single parameter - keep original case
        if (text == null) return "";
        return text.replaceAll("[^a-zA-Z]", "");
    }
    
    public static String removeNonAlpha(String text, boolean toUpperCase) {
        if (text == null) return "";
        
        // Remove all non-letter characters
        String result = text.replaceAll("[^a-zA-Z]", "");
        
        // Convert case based on boolean parameter
        if (toUpperCase) {
            return result.toUpperCase();  // true = UPPERCASE
        } else {
            return result.toLowerCase();  // false = lowercase
        }
    }
}