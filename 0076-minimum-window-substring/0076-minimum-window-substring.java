public class Solution {
    public String minWindow(String s, String t) {
        if (s.length() == 0 || t.length() == 0) return "";

        // Frequency map for characters in t
        int[] freq = new int[128];
        for (char c : t.toCharArray()) {
            freq[c]++;
        }

        int left = 0, right = 0;
        int required = t.length();
        int minLen = Integer.MAX_VALUE;
        int start = 0;

        while (right < s.length()) {
            char r = s.charAt(right);

            // If character is needed, decrease required count
            if (freq[r] > 0) {
                required--;
            }
            freq[r]--;
            right++;

            // When all characters are satisfied, shrink from left
            while (required == 0) {
                if (right - left < minLen) {
                    minLen = right - left;
                    start = left;         // ✅ FIXED: was cut off here
                }

                char l = s.charAt(left);
                freq[l]++;
                // If removing left char breaks the requirement, exit inner loop
                if (freq[l] > 0) {
                    required++;
                }
                left++;
            }
        }

        return minLen == Integer.MAX_VALUE ? "" : s.substring(start, start + minLen);
    }
}