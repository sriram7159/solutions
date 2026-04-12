class Solution:
    def findMissingAndRepeatedValues(self, grid: List[List[int]]) -> List[int]:
        row = len(grid)
        col = len(grid[0])
        seen = set()
        l = []
        mp = {}
        for i in range(row):
            for j in range(col):
                seen.add(grid[i][j])
                mp[grid[i][j]] = mp.get(grid[i][j],0)+1
        
        for i in mp:
            if mp.get(i)>1:
                l.append(i)
        
        

        for i in range(1,row*col+1):
            if i not in seen:
                l.append(i)
        
        return l

