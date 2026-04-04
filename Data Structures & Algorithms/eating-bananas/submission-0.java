class Solution {
    public int minEatingSpeed(int[] arr, int h) {
        int n = arr.length;
        int low = 1;
        int high = h;
        int res = arr[0];
        while(low<=high){
            int mid = low+(high-low)/2;
            int count = 0;
            for(int i : arr){
                count+=Math.ceil(i/mid);
            }

            if(count<=h){
                res = mid;
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return res;
    }
}
