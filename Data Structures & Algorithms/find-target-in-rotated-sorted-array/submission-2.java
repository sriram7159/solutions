class Solution {
    public int search(int[] arr, int target) {
      int pivot = p(arr);
      int idx = bs(arr,0,pivot-1,target);
      if(idx!=-1){
        return idx;
      }
      int idx1 = bs(arr,pivot,arr.length-1,target);

      return idx1;

    }

    public int bs(int arr[],int low ,int high,int target){
        int l = low;
        int h  = high;
        int idx = -1;
        while(l<=h){
            int mid =(l+h)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]>target){
                h = mid-1;
            }
            else{
                l = mid+1;
            }
        }

        return idx;
    }

    public int p(int arr[]){
        int low =0;
        int n = arr.length-1;
        int high = n;
        while(low<high){
            int mid =(low+high)/2;
            if(arr[mid]>arr[high]){
                low = mid+1;
            }
            else{
                high = mid;
            }
        }

        return high;
    }
}
