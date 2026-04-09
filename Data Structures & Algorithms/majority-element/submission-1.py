class Solution:
    def majorityElement(self, arr: List[int]) -> int:
        count = 0
        maj = arr[0]
        for i in range(len(arr)):
            if count==0:
                maj = arr[i]
                count+=1
            elif arr[i]==maj:
                count+=1
            else:
                count-=1
        
        return maj