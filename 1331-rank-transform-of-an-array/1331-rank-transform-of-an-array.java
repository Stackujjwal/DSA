class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[] clone = Arrays.copyOf(arr, arr.length);
        Arrays.sort(clone);
        HashMap<Integer, Integer> map = new HashMap<>();
        int rank = 1;
        for (int i = 0; i < clone.length; i++) {

            if (i == 0 || clone[i] != clone[i - 1]) {
                map.put(clone[i], rank);
                rank++;
            }
        }
        int[] ans = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            ans[i] = map.get(arr[i]);
        }
        return ans;
    }
}