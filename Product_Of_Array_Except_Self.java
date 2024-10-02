public class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] answer = new int[n];
        
        // Step 1: Fill answer array with the left products
        answer[0] = 1;  // No elements to the left of the first element
        for (int i = 1; i < n; i++) {
            answer[i] = nums[i - 1] * answer[i - 1];
        }
        
        // Step 2: Traverse from right and multiply with the current answer array
        int right = 1;  // No elements to the right of the last element
        for (int i = n - 1; i >= 0; i--) {
            answer[i] = answer[i] * right;
            right = right * nums[i];
        }
        
        return answer;
    }
}
