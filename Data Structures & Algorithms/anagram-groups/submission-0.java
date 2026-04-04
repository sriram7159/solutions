class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map = new HashMap<>();


        for(int i =0;i<strs.length;i++){
            String original = strs[i];
            char[] ch = strs[i].toCharArray();
            Arrays.sort(ch);
            String reversed = new String(ch);

            if(!map.containsKey(reversed)){
                map.put(reversed,new ArrayList<>());
            }

            map.get(reversed).add(original);
        }

        return new ArrayList<>(map.values());
    }
}
