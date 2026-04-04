class Solution:
    def replaceElements(self, arr: List[int]) -> List[int]:
        n = len(arr)
        l2 = n*[0]
        max_right = -1
        for i in range(n-1,-1,-1):
            l2[i] = max_right
            max_right = max(max_right,arr[i])
        return l2