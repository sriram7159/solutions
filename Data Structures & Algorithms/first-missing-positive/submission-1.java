class Solution {
    public int firstMissingPositive(int[] arr) {
        int count = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==1){
                count++;
            }

            if(arr[i]>arr.length || arr[i]<=0){
                arr[i] = 1;
            }
        }

        if(count==0) return 1;


        for(int i=0;i<arr.length;i++){
            int num = Math.abs(arr[i]);
            int idx = num-1;

            
arr[idx] = -Math.abs(arr[idx]);

        }

        for(int j=0;j<arr.length;j++){
            if(arr[j]>0){
                return j+1;
            }
        }

        return arr.length+1;
    }

}