class Solution {
    public int characterReplacement(String s, int k) {
        Map<Character, Integer> map = new HashMap<>();
        int i = 0, j = 0;
        int maxFreq = 0;
        int res = 0;

        while (j < s.length()) {
            char c = s.charAt(j);
            map.put(c, map.getOrDefault(c, 0) + 1);
           int  freq = method1(map);
            maxFreq = Math.max(maxFreq,freq);

            if ((j - i + 1) - maxFreq <= k) {
                res = Math.max(res, j - i + 1);
                j++;
            } else {
                char left = s.charAt(i);
                map.put(left, map.get(left) - 1);
                int freq1 = method1(map);
                  maxFreq = freq1;
                i++;
            }
        }
        return res;
    }
    public int method1(Map<Character,Integer> map){
        int count = 0;
        for(Map.Entry<Character,Integer> entry : map.entrySet()){
           char key = entry.getKey();
            int value = entry.getValue();

            if(value>count){
                count = value;
            }
        }
        return count;
    }
}
