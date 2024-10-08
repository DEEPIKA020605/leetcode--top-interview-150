public class Solution {
    public String reverseWords(String s) {
        // Trim leading and trailing spaces
        s = s.trim();
        
        // Split the string by one or more spaces
        String[] words = s.split("\\s+");
        
        // Reverse the words using StringBuilder
        StringBuilder reversed = new StringBuilder();
        
        // Start from the end of the array and append words to the StringBuilder
        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]);
            if (i > 0) {
                reversed.append(" ");
            }
        }
        
        return reversed.toString();
    }
    
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        // Test cases
        System.out.println(solution.reverseWords("the sky is blue")); 
        System.out.println(solution.reverseWords("  hello world  "));
         System.out.println(solution.reverseWords("a good   example")); 
    }
}
