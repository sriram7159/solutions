class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        mp = {}
        for i in nums:
            mp[i] = mp.get(i,0)+1
        
        for i in mp:
            if mp.get(i)>1:
                return True       
        return False