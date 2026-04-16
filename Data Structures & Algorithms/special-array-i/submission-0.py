class Solution:
    def isArraySpecial(self, arr: List[int]) -> bool:
        if len(arr)==1:
            return True
        
        for i in range(1,len(arr)):
            if arr[i]%2==0 and arr[i-1]%2==1:
                continue
            elif arr[i]%2==1 and arr[i-1]%2==0:
                continue
            else:
                return False
        
        return True
