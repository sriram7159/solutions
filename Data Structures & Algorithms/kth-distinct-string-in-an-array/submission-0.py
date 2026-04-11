class Solution:
    def kthDistinct(self, arr: List[str], k: int) -> str:
        mp = {}
        for i in range(len(arr)):
            mp[arr[i]] = mp.get(arr[i],0)+1
            l = []
        for i in mp:
            if mp.get(i)==1:
                l.append(i)
        
        if k>len(l):
            return ""
        else:
            return l[k-1]
        

