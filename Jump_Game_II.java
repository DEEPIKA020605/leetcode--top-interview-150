public class Solution {
    public int jump(int[] nums) {
        int jumps = 0;        // The number of jumps needed
        int currentEnd = 0;    // The farthest point reachable with current jumps
        int farthest = 0;      // The farthest point reachable overall
        
        for (int i = 0; i < nums.length - 1; i++) {
            // Update the farthest point we can reach from index i
            farthest = Math.max(farthest, i + nums[i]);
            
            // If we reach the end of the range that can be reached with the current number of jumps
            if (i == currentEnd) {
                jumps++;            // Increase the jump count
                currentEnd = farthest;  // Update the currentEnd to the farthest point reachable
                
                // If we have already reached or surpassed the last index, break
                if (currentEnd >= nums.length - 1) {
                    break;
                }
            }
        }
        
        return jumps;
    }
}
