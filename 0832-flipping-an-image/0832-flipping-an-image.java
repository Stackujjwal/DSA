class Solution {
    public int[][] flipAndInvertImage(int[][] img){
        for(int i=0;i<img.length;i++){
            int left=0;
            int right = img[i].length-1;
            while(left<right){
                int temp= img[i][left];
                img[i][left]=img[i][right];
                img[i][right]=temp;
                left++;
                right--;
            }
        }
         for(int i=0;i<img.length;i++){
             for(int j=0;j<img[i].length;j++){
                img[i][j]=1-img[i][j];
             }
         }
         return img;
        
    }
}