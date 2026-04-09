class Solution:
    def canPlaceFlowers(self, arr: List[int], n: int) -> bool:
        count = 0
        for i in range(1,len(arr)-1):
            if arr[i-1]==0 and arr[i+1]==0:
                count+=1
        
        if count>=n:
            return True
        else:
            return False

