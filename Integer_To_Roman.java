class Solution {
    public String intToRoman(int num) {
        // Define arrays for values and corresponding Roman symbols
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        
        // StringBuilder to store the resulting Roman numeral
        StringBuilder roman = new StringBuilder();
        
        // Iterate through each value-symbol pair
        for (int i = 0; i < values.length; i++) {
            // Append the symbol while num >= values[i]
            while (num >= values[i]) {
                roman.append(symbols[i]);
                num -= values[i];  // Subtract the value from num
            }
        }
        
        // Convert StringBuilder to string and return
        return roman.toString();
    }
}
