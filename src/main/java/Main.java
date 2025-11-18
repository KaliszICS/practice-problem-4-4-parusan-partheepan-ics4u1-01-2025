public class Main {
    public static void main(String[] args) {
        // Test convertString methods
        System.out.println(CampbellClass.convertString(42));        // "42"
        System.out.println(CampbellClass.convertString(3.14));      // "3.14"
        System.out.println(CampbellClass.convertString('A'));       // "A"
        System.out.println(CampbellClass.convertString(true));      // "true"
        
        // Test convertMetersToCenti methods
        System.out.println(CampbellClass.convertMetersToCenti(2));   // 200
        System.out.println(CampbellClass.convertMetersToCenti(1.5)); // 150.0
        
        // Test removeNonAlpha methods
        System.out.println(CampbellClass.removeNonAlpha("Hello123!"));           // "hello"
        System.out.println(CampbellClass.removeNonAlpha("Hello123!", true));     // "HELLO"
        System.out.println(CampbellClass.removeNonAlpha("Hello123!", false));    // "hello"
        System.out.println(CampbellClass.removeNonAlpha("A1b2C3!@#", true));     // "ABC"
    }
}