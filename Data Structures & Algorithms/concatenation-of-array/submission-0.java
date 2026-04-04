class Solution {
    public int[] getConcatenation(int[] arr) {
        int n = arr.length;
        int arr1[]  = new int[2*n];
        for(int i=0;i<n;i++){
            arr1[i] = arr[i];
            arr1[i+n] = arr[i];
        }

        return arr1;
    }
}