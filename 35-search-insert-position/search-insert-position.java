class Solution {
    public int searchInsert(int[] nums, int target) {
        int n = nums.length;
        int l=0;
        int r=n-1;
        int mid=0;
        while(l<=r){
            mid=(l+r)/2;
            if(nums[mid] == target){
                return mid;
            }
            else if(target>nums[mid]){
                l = mid+1;
            }
            else{
                r= mid-1;
            }
        }
        return l;
    }
}