class Solution {
    public int shipWithinDays(int[] arr, int target) {
        int low = Arrays.stream(arr).max().getAsInt();
        int high = Arrays.stream(arr).sum();
        int res = high;
        while(low<=high){
            int mid = low+(high-low)/2;
            int day = func(arr,mid);

            if(day<=target){
                res = mid;
                high = mid-1;
            }
            else{
                low = mid+1;
            }

        }
        return res;
    }

    public int func(int arr[] ,int capacity){
        int day = 1;
        int sum = 0;
        for(int i : arr){
            if(sum+i>capacity){
                day+=1;
                sum=i;
            }
            else{
                sum+=i;
            }
        }

        return day;
    }
}