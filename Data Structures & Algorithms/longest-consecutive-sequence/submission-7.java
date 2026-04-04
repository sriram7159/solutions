class Solution {
    public int longestConsecutive(int[] arr) {
        int count = 1;
        Set<Integer> set = new TreeSet<>();
        for(int m : arr){
            set.add(m);
        }
        int[] arr2 = new int[set.size()];
        int idx = 0;
        for(int j : set){
            arr2[idx++] = j;
        }
         int n = arr2.length;


        if(arr2.length==0) return 0;
        int res = 1;
        for(int i=1;i<n;i++){

            if(arr2[i]==arr2[i-1]+1){
                count++;
            }
            else if(arr2[i]==arr2[i-1]){
                continue;
            }
            else{
                count= 1;
            }


            res = Math.max(res,count);
        }

        return res;
    }
}
