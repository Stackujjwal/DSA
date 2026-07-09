import java.util.*;

class Solution {
    public int[] sortedSquares(int[] nums) {

        // Step 1: Separate negative and positive numbers
        List<Integer> neg = new ArrayList<>();
        List<Integer> pos = new ArrayList<>();

        for (int num : nums) {
            if (num < 0)        // ← Bug fixed: removed the semicolon
                neg.add(num);
            else
                pos.add(num);
        }

        int n1 = neg.size();
        int n2 = pos.size();

        // Step 2: Square negative numbers
        for (int i = 0; i < n1; i++)
            neg.set(i, neg.get(i) * neg.get(i));

        // Step 3: Reverse negatives (to make sorted ascending)
        Collections.reverse(neg);

        // Step 4: Square positive numbers (already sorted)
        for (int i = 0; i < n2; i++)
            pos.set(i, pos.get(i) * pos.get(i));

        // Step 5: Merge both sorted lists
        int[] res = new int[n1 + n2];
        int i = 0, j = 0, id = 0;

        while (i < n1 && j < n2) {
            if (neg.get(i) <= pos.get(j))
                res[id++] = neg.get(i++);
            else
                res[id++] = pos.get(j++);
        }

        // Step 6: Copy remaining negative elements
        while (i < n1)
            res[id++] = neg.get(i++);

        // Step 7: Copy remaining positive elements
        while (j < n2)
            res[id++] = pos.get(j++);

        return res;
    }
}
