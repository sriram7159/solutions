class Solution {
    public String minWindow(String s, String t) {
        Map<Character,Integer> map = new HashMap<>();
        for(int i=0;i<t.length();i++){
            char ch = t.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        int i=0;
        int j=0;
        int n = s.length();
        int rl = t.length();
        int res = Integer.MAX_VALUE;
        int ep = 0;
        while(j<n){
            char left = s.charAt(j);
            if(map.containsKey(left)){
                if(map.get(left)>0){
                    rl-=1;
                }
                 map.put(left,map.getOrDefault(left,0)-1);
                
            }
           
            
            while(rl==0){
                char right = s.charAt(i);
                ep = i;
                res = Math.min(j-i+1,res);
                if(map.containsKey(right)){
                    map.put(right,map.getOrDefault(right,0)+1);
                    if(map.get(right)>0){
                        rl+=1;
                    }
                }
                i++;
            }
            j++;
        }

        return res==Integer.MAX_VALUE ? "" : s.substring(ep,ep+res);
    }
}
