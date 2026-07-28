class Solution {
    public int largestAltitude(int[] gain) {
        int curr=0;
        int high=0;
        for(int i =0;i<gain.length;i++){
            curr = curr + gain[i];
            if(curr>high){
                high=curr;
            }
        }
        return high;
    }
}