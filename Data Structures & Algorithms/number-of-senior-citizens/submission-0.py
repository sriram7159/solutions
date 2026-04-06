class Solution:
    def countSeniors(self, details: List[str]) -> int:
        count = 0
        for i in range(len(details)):
            res = details[i]
            if(int(res[11:13])>60):
                count+=1
        return count
