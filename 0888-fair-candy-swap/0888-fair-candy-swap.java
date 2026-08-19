import java.util.Arrays;

class Solution {
    public int[] fairCandySwap(int[] alice, int[] bob) {

        int sumA = 0;
        int sumB = 0;

        for (int x : alice) {
            sumA += x;
        }

        for (int x : bob) {
            sumB += x;
        }

        int diff = (sumA - sumB) / 2;

        Arrays.sort(bob);

        for (int a : alice) {

            int b = a - diff;

            int low = 0;
            int high = bob.length - 1;

            while (low <= high) {

                int mid = low + (high - low) / 2;

                if (bob[mid] == b) {
                    return new int[]{a, b};
                }

                if (bob[mid] < b) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }

        return new int[]{};
    }
}