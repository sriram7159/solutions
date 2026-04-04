class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        dict = {}
        for i in range(len(nums)):
            dict[nums[i]] = i
        
        for i in nums:
            remaing = target-i
            if remaing in dict:
                return [dict.get(i),dict.get(remaing)]
        
        return []

        