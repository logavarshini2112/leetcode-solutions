class Solution:
    def isPowerOfThree(self, n: int) -> bool:
        if n == 1:
            return True
        result =0 
        for i in range(30):
            result = int(3 ** i)
            if result == n:
                return True
        
        return False