public class Solution {
    public int lengthOfLastWord(String s) {
        int length = 0;
        int i = s.length() - 1;

        // Skip trailing spaces
        while (i >= 0 && s.charAt(i) == ' ') {
            i--;
        }

        // Count the length of the last word
        while (i >= 0 && s.charAt(i) != ' ') {
            length++;
            i--;
        }

        return length;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        
        String s1 = "Hello World";
        String s2 = "   fly me   to   the moon  ";
        String s3 = "luffy is still joyboy";

        System.out.println("Length of last word: " + solution.lengthOfLastWord(s1)); // Output: 5
        System.out.println("Length of last word: " + solution.lengthOfLastWord(s2)); // Output: 4
        System.out.println("Length of last word: " + solution.lengthOfLastWord(s3)); // Output: 6
    }
}
