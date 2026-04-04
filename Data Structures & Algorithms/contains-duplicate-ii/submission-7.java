class Solution {
    public boolean containsNearbyDuplicate(int[] arr, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i =0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                if(Math.abs(map.get(arr[i])-i)<=k){
                    return true;
                }
            }
            map.put(arr[i],i);
        }
            return false;
    }
}