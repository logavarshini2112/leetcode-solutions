class Solution:
    def twoSum(self, nums: list[int], target: int) -> list[int]:
        n = len(nums)
        ans = [0,0]
        for i in range(n):
            for j in range(i+1,n):
                if nums[i] + nums[j] == target:
                    ans[0]=i
                    ans[1]=j
        return ans
        