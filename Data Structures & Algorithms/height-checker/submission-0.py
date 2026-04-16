class Solution:
    def heightChecker(self, arr: List[int]) -> int:
        new_arr = sorted(arr)
        count= 0
        for i in range(len(new_arr)):
            if arr[i]==new_arr[i]:
                continue
            else:
                count+=1
        
        return count

