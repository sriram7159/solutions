class Solution {
    public int minEatingSpeed(int[] arr, int h) {
        int n = arr.length;
        int low = 1;
        int high = Arrays.stream(arr).max().getAsInt();
        int res = high;
        while(low<=high){
            int mid = low+(high-low)/2;
            int count = 0;
            for(int i : arr){
                count+=Math.ceil((double)i/mid);
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
