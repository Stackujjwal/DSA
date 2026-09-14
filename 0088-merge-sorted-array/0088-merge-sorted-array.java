class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int u = 0;
        for (int i = 0; i < n; i++) {
            nums1[i + m] = nums2[i];
        }
        int k = nums1.length;
        for (int i = 0; i < k - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < k - i - 1; j++) {
                if (nums1[j] > nums1[j + 1]) {
                    int temp = nums1[j];
                    nums1[j] = nums1[j + 1];
                    nums1[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped)
                break;
        }
    }
}