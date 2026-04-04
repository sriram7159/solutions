class Solution {
    public void moveZeroes(int[] arr) {
        int n = arr.length;
        int i = 0;
        int j = 0;

        while(j<n){
            if(arr[j]!=0){
                swap(arr,i,j);
                i++;
                j++;
            }
            else{
                j++;
            }
        }

        for(int k=i;k<n;k++){
            arr[k] = 0;
        }
    }

    public void swap(int arr[],int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}