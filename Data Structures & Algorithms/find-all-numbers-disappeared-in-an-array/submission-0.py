class Solution:
    def findDisappearedNumbers(self, nums: List[int]) -> List[int]:
        seen = set()
        for i in range(len(nums)):
            seen.add(nums[i])
        
        l = []

        for i in range(1,len(nums)+1):
            if i in seen:
                continue
            else:
                l.append(i)
        
        return l