class Solution {
    public int[] twoSum(int[] numbers, int target) {

        int low = 0;
        int high = numbers.length - 1;

        while (low < high) {

            int sum = numbers[low] + numbers[high];

            // Sum target ke equal hai
            if (sum == target) {
                // Question 1-based indices maangta hai
                return new int[] { low + 1, high + 1 };
            }

            // Sum chhota hai → left pointer aage badhao
            else if (sum < target) {
                low++;
            }

            // Sum bada hai → right pointer peeche lao
            else {
                high--;
            }
        }

        return new int[] {};
    }
}