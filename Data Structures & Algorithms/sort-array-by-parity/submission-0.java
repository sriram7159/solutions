class Solution {
    public int[] sortArrayByParity(int[] arr) {
        int n = arr.length;
        int i = 0;
        int j = 0;
        int k = n-1;
        while(j<=k){
            if(arr[j]%2==0){
                swap(arr,i,j);
                i++;
                j++;
            }
            else if(arr[j]%2==1){
                swap(arr,j,k);
                k--;
            }
        }

        return arr;
    }
    public void swap(int arr[],int i ,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}