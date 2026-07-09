class Solution {
    public List<Integer> findAnagrams(String s, String p) {

        List<Integer> ans = new ArrayList<>();

        if(p.length() > s.length()) {
            return ans;
        }

        int[] pFreq = new int[26];
        int[] windowFreq = new int[26];

        // first window
        for(int i=0;i<p.length();i++) {
            pFreq[p.charAt(i)-'a']++;
            windowFreq[s.charAt(i)-'a']++;
        }

        // sliding window
        for(int i=0;i<s.length()-p.length();i++) {

            if(Arrays.equals(pFreq, windowFreq)) {
                ans.add(i);
            }

            // remove left char
            windowFreq[s.charAt(i)-'a']--;

            // add right char
            windowFreq[s.charAt(i+p.length())-'a']++;
        }

        // check last window
        if(Arrays.equals(pFreq, windowFreq)) {
            ans.add(s.length()-p.length());
        }

        return ans;
    }
}