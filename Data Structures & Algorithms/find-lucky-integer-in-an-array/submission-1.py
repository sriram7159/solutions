class Solution:
    def findLucky(self, arr: List[int]) -> int:
        mp = {}
        for i in range(len(arr)):
            mp[arr[i]] = mp.get(arr[i],0)+1
        
        large = -1
        for key,value in mp.items():
            if key==value:
                large = max(key,large)
        
        return large
