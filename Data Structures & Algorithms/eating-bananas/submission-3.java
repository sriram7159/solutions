class Solution {
    public int minEatingSpeed(int[] arr, int h) {
        int l = 1;
        int r = Arrays.stream(arr).max().getAsInt();
        int res = r;
        while(l<=r){
            int mid = l+(r-l)/2;
            int count = 0;
            for(int i : arr){
                count+=Math.ceil((double)i/mid);
            }
            if(count<=h){
                res = mid;
                r = mid-1;
            }
            else{
                l = mid+1;
            }
        }
        return res;
    }
}
