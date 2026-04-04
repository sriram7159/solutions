class Solution {
    public int[] replaceElements(int[] arr) {
        int n = arr.length;
        int res[] = new int[n];
        for(int i=0;i<n-1;i++){
            int max = func(arr,i+1,n);
            res[i] = max;
        }
        res[n-1] = -1;

        return res;
    }

    public int func(int [] arr,int i,int j){
        int max = -1;
        for(int k=i;k<j;k++){

            if(arr[k]>max){
                max = arr[k];
            }
        }
        return max;
    }
}