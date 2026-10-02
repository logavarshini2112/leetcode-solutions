class Solution {
    public int arrayPairSum(int[] nums) {
        int n = nums.length;
        int  total=0;
        Arrays.sort(nums);
        for(int i=1; i<n; i=i+2){
            int ans = Math.min(nums[i],nums[i-1]);
            total=total+ans;
        }
        return total;
    }
}