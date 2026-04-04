class Solution {
    public int findMaxConsecutiveOnes(int[] arr) {
        int count =0;
        int res = 0;
        int n = arr.length;
        for(int i : arr){
            if(i==1){
                count++;
            }else{
                count =0;
            }

            res = Math.max(count,res);
        }

        return res;
    }
}