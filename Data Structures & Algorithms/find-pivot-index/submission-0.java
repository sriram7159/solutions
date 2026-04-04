class Solution {
    public int pivotIndex(int[] arr) {
        int[] arr2 = new int[arr.length];
        arr2[0]  =  arr[0];
        int res = -1;
        for(int i=1;i<arr.length;i++){
            arr2[i] = arr2[i-1] + arr[i];
        }

        for(int i=1;i<arr.length;i++){
            if(arr2[i-1]==arr2[arr.length-1]-arr2[i]){
                res = i;
            }


        }

        return res;


    }
}