import java.util.HashMap;

class Solution {
    public int totalFruit(int[] fruits) {
        HashMap<Integer, Integer> basket = new HashMap<>();
        int left = 0, maxFruits = 0;

        for (int right = 0; right < fruits.length; right++) {
            // Add fruit at right into basket
            basket.put(fruits[right], basket.getOrDefault(fruits[right], 0) + 1);

            // Shrink from left if more than 2 fruit types
            while (basket.size() > 2) {
                int lf = fruits[left];
                basket.put(lf, basket.get(lf) - 1);
                if (basket.get(lf) == 0) basket.remove(lf);
                left++;
            }

            // Valid window — update answer
            maxFruits = Math.max(maxFruits, right - left + 1);
        }

        return maxFruits;
    }
}