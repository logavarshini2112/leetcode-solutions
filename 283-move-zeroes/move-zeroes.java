class Solution {
    public void moveZeroes(int[] nums) {
        int zero =0;
        int n = nums.length;
        for(int i=0; i<n; i++){
            if(nums[i] != 0){
                nums[zero++] = nums[i];
            }
        }
        while(zero<n){
            nums[zero] = 0;
            zero++;
        }
        return;
    }
}