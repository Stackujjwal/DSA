class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int n = nums.length;
        int maxVal= Integer.MIN_VALUE;
        int minVal= Integer.MAX_VALUE;
        int start= -1, end= -1;

        for(int i=0;i<n;i++ ){
            if(nums[i]<maxVal){
                end= i;
            }else{
                maxVal=nums[i];
            }
        }
        for(int i=n-1;i>=0;i--){
            if(nums[i]>minVal){
                start=i;
            }else{
                minVal=nums[i];
            }
        }
        if(end==-1) return 0;
        return end - start + 1;
    }
}