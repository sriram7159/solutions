class Solution {
    public int characterReplacement(String s, int k) {
        Map<Character, Integer> map = new HashMap<>();
        int i = 0, j = 0;
        int maxFreq = 0;
        int res = 0;

        while (j < s.length()) {
            char c = s.charAt(j);
            map.put(c, map.getOrDefault(c, 0) + 1);

            // update max frequency ONLY on expansion
            maxFreq = Math.max(maxFreq, map.get(c));

            if ((j - i + 1) - maxFreq <= k) {
                res = Math.max(res, j - i + 1);
                j++;
            } else {
                char left = s.charAt(i);
                map.put(left, map.get(left) - 1);
                i++;
            }
        }
        return res;
    }
}
