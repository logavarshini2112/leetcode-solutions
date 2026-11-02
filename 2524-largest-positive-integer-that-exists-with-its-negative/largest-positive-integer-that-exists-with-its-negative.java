class Solution {
    public int findMaxK(int[] nums) {
         int n=nums.length;
         int max =-1;
         for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(nums[j]==-nums[i]){
                    max=Math.max(max,nums[i]);
                }
            }
         }
         return max;
    }
}