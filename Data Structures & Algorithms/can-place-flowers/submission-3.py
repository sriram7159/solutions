class Solution:
    def canPlaceFlowers(self, arr: List[int], n: int) -> bool:
        count = 0
        for i in range(len(arr)-1):
            if i==0 and arr[i+1]==0 and arr[i]==0:
                count+=1
                arr[i]=1
            elif arr[i]==0 and arr[i+1]==0 and arr[i-1]==0:
                arr[i]=1
                count+=1
        
        return count>=n

