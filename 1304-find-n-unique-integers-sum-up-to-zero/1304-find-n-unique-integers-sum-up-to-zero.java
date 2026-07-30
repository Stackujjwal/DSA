class Solution {
    public int[] sumZero(int n) {
        int[] ans = new int[n];
        int index = 0;
        int value = 1;
        while(index + 1 < n) {
            ans[index] = value;
            ans[index + 1] = -value;
            index += 2;
            value++;
        }
        return ans;

    }
}