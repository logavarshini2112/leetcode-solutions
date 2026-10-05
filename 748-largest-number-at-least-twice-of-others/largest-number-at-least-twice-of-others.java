class Solution {
    public int dominantIndex(int[] nums) {
        int n = nums.length;
        int max=nums[0];
        int res=0;
        int index=0;
        for(int i=1; i<n; i++){
            if(nums[i]>max){
                 index = i;
                max = nums[i];
                // return index;
            }
        }
        for(int i=0; i<n; i++){
            if(i!=index&&max<nums[i]*2){
                return -1;
            }
        }
        return index;
      
    }
}