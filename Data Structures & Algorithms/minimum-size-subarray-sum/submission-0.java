class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int i = 0;
        int j = 0;
        int sum = 0;
        int n = nums.length;
        int res = Integer.MAX_VALUE;
        while(j<n){
            sum = sum + nums[j];
            while(sum>=target){
                res = Math.min(j-i+1,res);
                sum = sum - nums[i];
                i++;
            }
            j++;
        }
        return res==Integer.MAX_VALUE ? 0 : res;
    }
}