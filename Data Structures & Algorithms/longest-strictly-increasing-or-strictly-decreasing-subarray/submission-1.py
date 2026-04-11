class Solution:
    def longestMonotonicSubarray(self, nums: List[int]) -> int:
        inc = 0
        dec = 0 
        count1=0
        count2=0
        for i in range(1,len(nums)):
            if nums[i]>nums[i-1]:
                count1+=1
                inc = max(inc,count1)
            else:
                count1=0
        for j in range(1,len(nums)):
            if nums[j]<nums[j-1]:
                count2+=1
                dec = max(dec,count2)
            else:
                count2=0
        
        if inc==0:
            return dec+1
        elif dec==0:
            return inc+1
        else:
            return max(inc,dec)+1
        

