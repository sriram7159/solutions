class Solution {
    public boolean containsNearbyDuplicate(int[] arr, int k) {
        Map<Integer,Integer>  map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(!map.containsKey(arr[i])){
                map.put(arr[i],i);
            }
            else{
               int p =  map.get(arr[i]);
               int r = i;
               int res = Math.abs(p-r);

               if(res<=k) return true;
            }
        }
        return false;
    }
}