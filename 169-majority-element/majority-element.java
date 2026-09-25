class Solution {
    public int majorityElement(int[] nums) {
      int n = nums.length;
      int m = n/2;
      Arrays.sort(nums);
      int num = nums[m];
      return num;
         }
}