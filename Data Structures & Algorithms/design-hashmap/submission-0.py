class MyHashMap:

    def __init__(self):
        self.nums = [0]*1000001

    def put(self, key: int, value: int) -> None:
        self.nums[key] = value

    def get(self, key: int) -> int:
        if self.nums[key]==0:
            return -1
        else:
            return self.nums[key]
        

    def remove(self, key: int) -> None:
        self.nums[key] = 0

        


# Your MyHashMap object will be instantiated and called as such:
# obj = MyHashMap()
# obj.put(key,value)
# param_2 = obj.get(key)
# obj.remove(key)