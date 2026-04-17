class Solution:
    def check(self, nums: List[int]) -> bool:
        original = sorted(nums)
        for i in range(0,100):
            new_nums = nums[i%len(nums):]+nums[:i%len(nums)]
            if new_nums == original:
                return True
        
        return False