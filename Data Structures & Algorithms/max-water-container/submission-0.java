class Solution {
    public int maxArea(int[] arr) {
        int n = arr.length;
        int i=0;
        int j = n-1;
        int sum = Integer.MIN_VALUE;
        while(i<j){
            int res = Math.min(arr[i],arr[j]);
            int width = j-i;
            int total = res*width;

            sum = Math.max(sum,total);
            if(arr[i]>arr[j]){
                j--;
            }
            else{
                i++;
            }
        }
        return sum;
    }
}
