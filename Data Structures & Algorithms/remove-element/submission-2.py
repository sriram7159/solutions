class Solution:
    def removeElement(self, arr: List[int], val: int) -> int:
        k = 0
        i=0
        while(i<len(arr)):
            if arr[i]==val:
                i+=1
                continue
            else:
                arr[k] = arr[i]
                k+=1
                i+=1
            
        return k
