class Solution {
    public int removeDuplicates(int[] arr) {
        int n = arr.length;
        int i =0;
        int j =0;
        while(j<n){
            if(arr[i]==arr[j]){
                j++;
            }
            else if(arr[i]!=arr[j]){
                arr[i+1] = arr[j];
                i++;
            }
        }

        return i+1;
    }
}