class Solution {
    public int removeElement(int[] nums, int val) {
        // Initialize a pointer for the position of elements not equal to val
        int k = 0;
        
        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            // If the current element is not equal to val
            if (nums[i] != val) {
                // Place it at index k and increment k
                nums[k] = nums[i];
                k++;
            }
        }
        
        // Return the number of elements not equal to val
        return k;
    }
}
