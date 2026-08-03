class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {

        List<Integer> ans = new ArrayList<>();

        // 4 boundaries
        int top = 0;
        int bottom = matrix.length - 1;
        int left = 0;
        int right = matrix[0].length - 1;

        // Jab tak matrix mein elements bache hain
        while (top <= bottom && left <= right) {

            // 1. Top Row (Left -> Right)
            for (int j = left; j <= right; j++) {
                ans.add(matrix[top][j]);
            }
            top++;

            // 2. Right Column (Top -> Bottom)
            for (int i = top; i <= bottom; i++) {
                ans.add(matrix[i][right]);
            }
            right--;

            // 3. Bottom Row (Right -> Left)
            // Sirf tab jab bottom row abhi bhi bachi ho
            if (top <= bottom) {
                for (int j = right; j >= left; j--) {
                    ans.add(matrix[bottom][j]);
                }
                bottom--;
            }

            // 4. Left Column (Bottom -> Top)
            // Sirf tab jab left column abhi bhi bacha ho
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    ans.add(matrix[i][left]);
                }
                left++;
            }
        }

        return ans;
    }
}