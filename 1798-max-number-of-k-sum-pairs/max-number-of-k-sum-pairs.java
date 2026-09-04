class Solution {
    public int maxOperations(int[] nums, int k) {
        int  n =nums.length;
        int l = 0;
        int r =n-1;
        int count=0;
        int sum =0;
        Arrays.sort(nums);
        while(l<r){
            sum = nums[l]+nums[r];
            if(sum == k){
                count++;
                l++;
                r--;
            }
            else if(sum < k){
                   l++;
            }
            else{
              r--;
            }
        }
        return count;
    }
}