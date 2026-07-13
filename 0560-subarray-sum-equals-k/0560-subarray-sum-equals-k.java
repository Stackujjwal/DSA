class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        // Initially prefix sum = 0 ek baar aaya hai
        map.put(0, 1);
        int sum = 0;
        int count = 0;
        for (int num : nums) {
            // Running Prefix Sum
            sum += num;
            // Kya (sum - k) pehle aaya tha?
            count += map.getOrDefault(sum - k, 0);
            // Current Prefix Sum store karo
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return count;
    }
}