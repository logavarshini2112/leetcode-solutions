class Solution {
    public int minMergedInteger(int[] nums) {
        int min = Integer.MAX_VALUE;
        int n = nums.length;
        for(int i=0; i<n; i += 2){
            String total = String.valueOf(nums[i])+nums[i+1];
            int a = Integer.parseInt(total);
            min = Math.min(min,a); 
           
        }
         return min;
        }
}