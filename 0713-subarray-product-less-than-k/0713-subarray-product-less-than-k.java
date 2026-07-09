class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if (k <= 1) return 0;  // Edge case: no positive product can be < 1

        int left = 0;
        int product = 1;
        int count = 0;

        for (int right = 0; right < nums.length; right++) {
            product *= nums[right];                    // Expand window

            while (product >= k) {                    // Shrink from left
                product /= nums[left];
                left++;
            }

            count += right - left + 1;                // Count valid subarrays
        }

        return count;
    }
}