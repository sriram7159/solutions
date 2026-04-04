class Solution {
    public int longestConsecutive(int[] arr) {
        Arrays.sort(arr);
        int count =1;
        int n = arr.length;
        int res = Integer.MIN_VALUE;
        for(int i=1;i<n;i++){

            if(arr[i]==arr[i-1]+1){
                count++;
            }
            else if(arr[i]==arr[i-1]){
                continue;
            }

            
            else{
                res = Math.max(res,count);
                count= 0;
                continue;
            }
            res = Math.max(res,count);


            
        }

        return res;
    }
}
