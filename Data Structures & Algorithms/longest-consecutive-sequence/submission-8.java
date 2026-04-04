class Solution {
    public int longestConsecutive(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for(int i : arr){
            set.add(i);
        }
        int res = 0;
        int count =0;
        for(int ele : set){
            count  = 1;
            int n = ele;
            if(!set.contains(n-1)){
                while(set.contains(n+1)){
                    count++;
                    n++;
                }

                res = Math.max(count,res);
            }
        }
        return res;
    }
}
