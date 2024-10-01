public class Solution {
    public boolean canJump(int[] nums) {
        int maxReach = 0;  // The farthest index we can reach
        for (int i = 0; i < nums.length; i++) {
            if (i > maxReach) {
                return false;  // We can't move further
            }
            maxReach = Math.max(maxReach, i + nums[i]);  // Update maxReach
        }
        return true;  // We can reach the last index
    }
}
