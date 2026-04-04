class Solution {
    public int[] twoSum(int[] arr, int target) {

        Map<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<arr.length;i++){
            map.put(arr[i],i);
        }

        for(int i=0;i<arr.length;i++){
            int rest = target-arr[i];
            if(map.containsKey(rest) && map.get(rest)!=i){
                return new int[] {i,map.get(rest)};
            }
        }

        return new int[]{0,0};
    }
}
