class Solution {
    public int subarraySum(int[] arr, int k) {
        int n = arr.length;
        int cs = 0;
        int count = 0;

        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        for(int i : arr){
            cs +=i;
            int diff = cs-k;

            if(map.containsKey(diff)){
                count+=map.get(diff);
            }

            map.put(cs,map.getOrDefault(cs,0)+1);

        }
        return count;
    }
}