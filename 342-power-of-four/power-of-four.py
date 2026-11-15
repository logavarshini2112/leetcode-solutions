class Solution:
    def isPowerOfFour(self, n: int) -> bool:
        if n == 1:
            return True
        result =0
        for i in range(16):
            result = int(4 ** i)
            if result == n:
                return True
        
        return False