class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int low = 0;
        int high = 0;
        for (int weight : weights) {
            low = Math.max(low, weight);
            high += weight;
        }
        while (low < high) {
            int mid = low + (high - low) / 2;
            int reqdays = 1;
            ;
            int currweight = 0;
            for (int weight : weights) {
                if (currweight + weight > mid) {
                    reqdays++;
                    currweight = 0;
                }
                currweight += weight;
            }
            if (reqdays <= days) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
            return low;
    }
}