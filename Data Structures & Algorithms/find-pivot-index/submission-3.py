class Solution:
    def pivotIndex(self, arr: List[int]) -> int:
        sum = 0
        for i in range(len(arr)):
            sum+=arr[i]
        
        leftsum = 0
        for i in range(len(arr)):
            rightsum = sum-arr[i]-leftsum
            if leftsum==rightsum:
                return i
            else:
                leftsum+=arr[i]
        
        return -1
