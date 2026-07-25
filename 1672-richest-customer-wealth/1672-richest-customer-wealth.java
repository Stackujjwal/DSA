class Solution {
    public int maximumWealth(int[][] arr) {
        int maxSum=0;
        for(int i =0;i<arr.length;i++){
            int currVal=0;
            for(int j=0;j<arr[i].length;j++){
                currVal+=arr[i][j];
            } 
            if(currVal>maxSum){
                maxSum=currVal;
            }

        }
        return maxSum;
    }
}