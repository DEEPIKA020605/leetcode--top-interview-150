import java.util.HashMap;
import java.util.Map;

public class Solution {  // Renamed the class to Solution
    public int romanToInt(String s) {
        // Create a map for Roman numerals and their corresponding values
        Map<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);
        
        // Initialize result variable
        int result = 0;
        
        // Loop through each character in the string
        for (int i = 0; i < s.length(); i++) {
            // Get the current value from the map
            int currentValue = romanMap.get(s.charAt(i));
            
            // If we're not at the first character, check if the current value is greater
            // than the previous value (indicating a subtraction case)
            if (i > 0 && currentValue > romanMap.get(s.charAt(i - 1))) {
                // Subtract twice the previous value (because it was added once before)
                result += currentValue - 2 * romanMap.get(s.charAt(i - 1));
            } else {
                // Otherwise, just add the current value
                result += currentValue;
            }
        }
        
        return result;
    }
}
