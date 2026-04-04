class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        l1 = 26*[0]
        l2 = 26*[0]
        if len(s)!=len(t):
            return False
        for i in range(len(s)):
            l1[ord(s[i])-ord('a')]+=1
            l2[ord(t[i])-ord('a')]+=1
          
        
        for i in range(26):
            if l1[i]!=l2[i]:
                return False
        return True