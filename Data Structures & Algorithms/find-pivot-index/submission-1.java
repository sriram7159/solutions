class Solution {
    public int pivotIndex(int[] arr) {
        int n = arr.length;
        int total_sum = 0;
        for(int i : arr){
            total_sum +=i;
        }

        int arr2[] = new int[n];
        arr2[0] = arr[0];
        for(int i=1;i<n;i++){
            arr2[i] = arr2[i-1]+arr[i];
        }
        int ls = 0;
        int rs = 0;

        for(int k =0;k<n;k++){
            if(k==0){
                ls = 0;
                rs = total_sum -arr2[k];
                if(ls==rs) return k;
                continue;
            }

            ls = arr2[k-1];
            rs = total_sum - arr2[k];
            if(ls==rs) return k;
            
        }

        return -1;
    }
}