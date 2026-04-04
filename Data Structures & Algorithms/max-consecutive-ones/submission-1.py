class Solution:
    def findMaxConsecutiveOnes(self, nums: List[int]) -> int:
        max_sum = float('-inf')
        sum = 0
        for i in range(len(nums)):
            if nums[i]==0:
                
                sum=0
            else:
                sum+=1
            max_sum = max(sum,max_sum)
        
        return max_sum

        