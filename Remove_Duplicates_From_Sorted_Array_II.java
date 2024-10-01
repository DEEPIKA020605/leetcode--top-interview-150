class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0; // Edge case: empty array
        
        int k = 1; // Pointer for the position of unique elements
        int count = 1; // Count occurrences of the current element

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                count++; // Increment count for duplicate
            } else {
                count = 1; // Reset count for a new unique element
            }

            // Allow at most two duplicates
            if (count <= 2) {
                nums[k] = nums[i]; // Update the array with the allowed duplicate
                k++; // Move to the next position for unique elements
            }
        }

        return k; // k is the number of unique elements (at most two each)
    }
}
