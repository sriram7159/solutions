class Solution {
    public boolean containsNearbyDuplicate(int[] arr, int k) {
        int n = arr.length;
        HashSet<Integer> set = new HashSet<>();
        for(int i : arr){
            set.add(i);

        }
        int count = 0;
        for(int r : set){
            if(r==0) continue;
            count = count +1;
        }
        return count==k;
    }
}