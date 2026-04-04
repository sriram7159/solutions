class Solution:
    def lengthOfLastWord(self, s: str) -> int:
        s = s.strip()
        l = []
        l = s.split(" ")
        last = l[len(l)-1]
        return len(last)