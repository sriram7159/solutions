class Solution {
    public void sortColors(int[] arr) {
        int n = arr.length;
        int i =0;
        int j = 0;
        int k = n-1;

        while(j<k){
            if(arr[j]==2){
                swap(arr,j,k);
                k--;
            }
            else if(arr[j]==0){
                swap(arr,i,j);
                i++;
                j++;
            }
            else{
                j++;
            }
        }
    }

    public void swap(int arr[] ,int start,int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}