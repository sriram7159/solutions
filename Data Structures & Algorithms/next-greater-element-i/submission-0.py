class Solution:
    def nextGreaterElement(self, nums1: List[int], nums2: List[int]) -> List[int]:
        l = []
        for i in range(len(nums1)):
            index = self.method1(nums1[i],nums2)
            maxi = -1
            for j in range(index,len(nums2)):
                if nums1[i]!=nums2[j]:
                    if nums2[j]>nums1[i]:
                        maxi = nums2[j]
                        l.append(nums2[j])
                        break
            if maxi==-1:
                l.append(-1)
        return l
    def method1(self,target: int,arr: List[int]) -> int:
        for i in range(len(arr)):
            if(arr[i]==target):
                return i
        return -1