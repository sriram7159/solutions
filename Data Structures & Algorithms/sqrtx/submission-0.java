class Solution {
    public int mySqrt(int x) {
        int l = 1;
        int r = x;
        int target = (int) Math.sqrt(x);
        while(true){
            int mid = l+(r-l)/2;
            if(mid<target){
                l = mid+1;
            }
            else if(mid>target){
                r = mid-1;
            }
            else{
                return mid;
            }
        }

    }
}