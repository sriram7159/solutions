class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character,Integer> map = new HashMap<>();
        int i = 0;
        int j = 0;
        int res = 0;
        char ch[] = s.toCharArray();
        while(j<ch.length){
            if(!map.containsKey(ch[j])){
                map.put(ch[j],1);
                j++;
            }
            else{
                while(map.containsKey(ch[j])){
                    map.remove(ch[i]);
                    i++;
                }
            }
            res = Math.max(res,j-i);
        }
        return res;
        }
}
