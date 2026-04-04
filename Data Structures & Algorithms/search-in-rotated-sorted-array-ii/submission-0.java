class Solution {
    public boolean search(int[] arr, int target) {
        int pivot = pivot_finding(arr);
        boolean res = (binarySearch(arr,0,pivot-1,target)||binarySearch(arr,pivot,arr.length-1,target));

        return res;
    }


    public int pivot_finding(int arr[]){
        int l = 0;
        int h = arr.length-1;
        while(l<h){
            int mid = l+(h-l)/2;
            if(arr[mid]>arr[h]){
                l = mid+1;
            }
            else if(arr[mid]<arr[h]){
                h = mid;
            }
            else{
                h--;
            }
        }

        return l;
    }

    public boolean binarySearch(int arr[],int low ,int high,int target){
        int l = low;
        int h = high;
        while(l<=h){
            int mid = l+(h-l)/2;
            if(arr[mid]==target){
                return true;
            }
            else if(arr[mid]>target){
                h = mid-1;
            }
            else{
                l = mid+1;
            }
        }

        return false;
    }
}