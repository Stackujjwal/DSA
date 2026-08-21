class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums2);
        Set<Integer>set=new HashSet<>();
        for(int x:nums1){
            int low=0;
            int high=nums2.length-1;
            while(low<=high){
                int mid=low+(high-low)/2;
                if(nums2[mid]==x){
                    set.add(x);
                    break;
                }else if(nums2[mid]<x){
                    low=mid+1;
                }else{
                    high=mid-1;
                }
            }
            
        }
        int []ans= new int[set.size()];
        int i =0;
        for(int x:set){
            ans[i++]=x;
        }
        return ans;

    }
}