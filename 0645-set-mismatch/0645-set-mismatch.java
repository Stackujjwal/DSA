class Solution {
    public int[] findErrorNums(int[] nums) {
        Arrays.sort(nums);
        int dup=0;
        int mis=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]){
                dup=nums[i];
            }
        }
        for(int i=1;i<=nums.length;i++){
            boolean found=false;
            for(int j=0;j<nums.length;j++){
                if(nums[j]==i){
                    found=true;
                    break;
                }
            }
            if(!found){
                mis=i;
                break;
            }
        }
        return new int[]{dup,mis};
    }
}