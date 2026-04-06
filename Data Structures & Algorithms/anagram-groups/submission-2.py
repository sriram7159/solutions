class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        l4=[]
        visited = [False]*len(strs)
        for i in range(len(strs)):
            if visited[i]==True:
                continue
            
            l1 = []
            res = self.method1(strs[i])
            l1.append(strs[i])
            visited[i] = True
            for j in range(len(strs)):
                if i==j:
                    continue
                else:
                    res1 = self.method1(strs[j])
                    if res1==res:
                        l1.append(strs[j])
                        visited[j] = True
            l4.append(l1)
        
        l4.sort(key=len)
        return l4


    def method1(self, arrs:List[str]) -> List[arr]:
        l3 = [0]*26
        for i in range(len(arrs)):
            l3[ord(arrs[i])-ord('a')]+=1
        
        return l3
