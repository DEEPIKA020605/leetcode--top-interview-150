import java.util.Arrays;

public class Solution {
    public int hIndex(int[] citations) {
        // Step 1: Sort the citations array in descending order
        Arrays.sort(citations);
        
        // Step 2: Check how many papers have at least h citations
        int n = citations.length;
        for (int i = 0; i < n; i++) {
            int h = n - i;  // h is the number of papers with at least h citations
            if (citations[i] >= h) {
                return h;
            }
        }
        
        return 0;
    }
}
