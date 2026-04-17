class Solution:
    def isMonotonic(self, nums: List[int]) -> bool:
        increasing = True
        decreasing = True
        for i in range(1,len(nums)):
            if nums[i]>=nums[i-1]:
                continue
            else:
                increasing = False
                break
        
        for i in range(1,len(nums)):
            if nums[i]<=nums[i-1]:
                continue
            else:
                decreasing = False
                break
        
        return increasing or decreasing



