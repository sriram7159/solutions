class Solution {
    public boolean searchMatrix(int[][] arr, int target) {
        int row = arr.length;
        int col = arr[0].length;
        int low = 0;
        int high = row*col-1;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(arr[mid/row][mid%row]>target){
                high = mid-1;
            }
            else if(arr[mid/row][mid%row]<target){
                low = mid+1;
            }
            else{
                return true;
            }
        }
        return false;
    }
}
