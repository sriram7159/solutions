class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int n = nums.length;
        for(int i=0;i<n;i++){
            if(map.containsKey(nums[i])){
                int check = Math.abs(map.get(nums[i])-i);
                if(check<=k){
                    return true;
                }
            }


                  map.put(nums[i],i);
  
  
          
        }
        return false;

    }
}