class Solution {
    public boolean containsNearbyDuplicate(int[] arr, int k) {
        int n = arr.length;
        HashSet<Integer> set = new HashSet<>();
        for(int i : arr){
            set.add(i);

        }
        int size = set.size();

        return size==k;
    }
}