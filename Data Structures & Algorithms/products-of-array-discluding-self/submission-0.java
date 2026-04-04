class Solution {
    public int[] productExceptSelf(int[] nums) {
        int prod = 1;
        int count = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                count++;
            }
            prod = prod*nums[i];
        }

        int with_zero_prod = 1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0) continue;

            with_zero_prod = nums[i] * with_zero_prod;
        }

        int arr[] = new int[nums.length];

        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0) {
                arr[i] = prod/nums[i];
            }

            else if(nums[i]==0 && count==1){
                arr[i] = with_zero_prod;
            }

            else if(nums[i]==0 && count>1){
                arr[i] = 0;
            }
        }

        return arr;
    }
}  
