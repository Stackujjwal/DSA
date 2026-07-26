class Solution {
    public int[] shuffle(int[] nums, int n) {
        int [] result= new int[nums.length];
        int i =0;
        int j=n;
        int idx=0;
     while(idx<2*n){
        result[idx++]=nums[i++];
        result[idx++]=nums[j++];
     }
     return result;
    }
}