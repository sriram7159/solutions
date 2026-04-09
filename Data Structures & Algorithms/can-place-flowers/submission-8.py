class Solution:
    def canPlaceFlowers(self, arr: List[int], n: int) -> bool:
        length = len(arr)
        if length==0:
            return True
        for i in range(len(arr)):
            if(arr[i]==0):
                left_kali = (i==0 or arr[i-1]==0)
                right_kali = (i==length-1 or arr[i+1]==0)

                if(left_kali and right_kali):
                    arr[i]=1
                    n-=1

                if n==0:
                    return True
            
        return False

           