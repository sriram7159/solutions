class Solution {
    public int maxProfit(int[] arr) {
        int i = 1;
        int prev = 0;
        int res = 0;
        int n = arr.length;
        while(i<n){

            if(arr[i]-arr[prev]>0){
                res = res + arr[i]-arr[prev];    
                i++;
                prev++;            
            }
            else{
                if(arr[i]<arr[prev]){
                    prev = i;
                    i++;
                }
            }

        }

        return res;
    }
}