class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] freq = new int[1001];
        int[] ans = new int[arr1.length];
        int i = 0;
        for (int x : arr1) {
            freq[x]++;
        }
        for (int x : arr2) {
            while (freq[x]-- > 0) {
                ans[i++] = x;
            }

        }
        for(int j=0;j<1001;j++){
            while(freq[j]-->0){
                ans[i++]=j;
            }
        }
        return ans;
    }
}