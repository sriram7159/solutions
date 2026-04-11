class Solution:
    def maxAscendingSum(self, arr: List[int]) -> int:
        res = 0
        sum = arr[0]
        for i in range(1,len(arr)):
            if arr[i]>arr[i-1]:
                sum+=arr[i]
                res = max(sum,res)
            else:
                sum = arr[i]
        
        return res