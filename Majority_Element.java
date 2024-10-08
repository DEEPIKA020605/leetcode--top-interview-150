class Solution {
    public int majorityElement(int[] nums) {
        int candidate = nums[0];
        int count = 0;

        for (int num : nums) {
            if (count == 0) {
                candidate = num; // Found a new candidate
            }
            count += (num == candidate) ? 1 : -1; // Increment or decrement count
        }

        return candidate; // The candidate is the majority element
    }
}
