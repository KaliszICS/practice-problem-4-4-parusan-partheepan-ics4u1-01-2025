/**
 * A utility class providing mathematical constants and operations.
 * This class cannot be instantiated and contains only static methods.
 * 
 * <p>Utility classes are designed to provide helper methods and constants
 * without the need for object instantiation.</p>
 */
public final class MyUtilityClass {
    /**
     * Maximum value constant used for validation or boundary checks.
     */
    public static final int MAXIMUM = 3000;
    
    /**
     * Private constructor to prevent instantiation.
     * This class should be used via its static methods and constants only.
     */
    private MyUtilityClass() {
        // Prevent object creation
    }

    /**
     * Returns the integer value zero.
     * 
     * @return the integer value 0
     */
    public static int returnZero() {
        return 0;
    }

    /**
     * Returns the smaller of two integer values.
     *
     * @param num1 the first integer value
     * @param num2 the second integer value
     * @return the smaller of the two integer values
     */
    public static int min(int num1, int num2) {
        if (num1 < num2) {
            return num1;
        }
        return num2;
    }
    
    /**
     * Returns the smaller of two double values.
     *
     * @param num1 the first double value
     * @param num2 the second double value
     * @return the smaller of the two double values
     */
    public static double min(double num1, double num2) {
        if (num1 < num2) {
            return num1;
        }
        return num2;
    }
}