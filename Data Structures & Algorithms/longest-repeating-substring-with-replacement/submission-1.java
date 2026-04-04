class Solution {
    public int characterReplacement(String s, int k) {
        Map<Character,Integer> map = new HashMap<>();
        int i =0;
        int j = 0;
        char[] ch = s.toCharArray();
        int n = ch.length;
        int maxFreq = 0;
        int res = 0;
        while(j<n){
            map.put(ch[j],map.getOrDefault(ch[j],0)+1);
           int freq = method1(map);
            maxFreq = Math.max(freq,maxFreq);
            if((j-i+1)-maxFreq<=k){
                res = Math.max(j-i+1,res);
                j++;
            }
            else{
                map.put(ch[j],map.getOrDefault(ch[j],0)-1);
                freq = method1(map);
                maxFreq = Math.max(freq,maxFreq);
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
