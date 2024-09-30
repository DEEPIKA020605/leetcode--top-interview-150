class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0; // Edge case: empty array

        int k = 0; // Pointer for the position of unique elements

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[k]) { // If the current element is different
                k++; // Move to the next position for unique elements
                nums[k] = nums[i]; // Update the array with the unique element
            }
        }

        return k + 1; // k is zero-indexed, so return k + 1 for count of unique elements
    }
}
