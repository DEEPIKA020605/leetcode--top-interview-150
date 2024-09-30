class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1; // Pointer for the end of initialized elements in nums1
        int j = n - 1; // Pointer for the end of nums2
        int k = m + n - 1; // Pointer for the end of nums1

        // Merge in reverse order
        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                i--;
            } else {
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }

        // Copy remaining elements from nums2 (if any)
        while (j >= 0) {
            nums1[k] = nums2[j];
            j--;
            k--;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Example input
        int[] nums1 = {1, 2, 3, 0, 0, 0}; // nums1 with space for nums2
        int m = 3; // Number of initialized elements in nums1
        int[] nums2 = {2, 5, 6}; // nums2
        int n = 3; // Number of elements in nums2

        // Merge the arrays
        solution.merge(nums1, m, nums2, n);
        
        // Output the result
        System.out.println(java.util.Arrays.toString(nums1)); // Output: [1, 2, 2, 3, 5, 6]
    }
}
