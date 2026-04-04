class Solution {
    public int maxProfit(int[] arr) {
        int min_price = arr[0];
        int n = arr.length;
        int res = 0;
        for(int i=1;i<n;i++){
            int current_diff = arr[i]-min_price;
            if(current_diff>res){
                res = current_diff;
            }

            if(arr[i]<min_price){
                min_price = arr[i];
            }
        }

        return res;
    }
}
