class Solution:
    def isPowerOfTwo(self, n: int) -> bool:
        if n == 1:
            return True
        result =0
        for i in range(31):
            result = int(2 ** i)
            if result == n:
                return True
        
        return False
        