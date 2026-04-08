class Solution:
    def generate(self, n: int) -> List[List[int]]:
        res = []
        for i in range(n):
            row = [1]*(i+1)

            for j in range(1,i):
                row[j] = res[i-1][j]+res[i-1][j-1]
            
            res.append(row)
        
        return res