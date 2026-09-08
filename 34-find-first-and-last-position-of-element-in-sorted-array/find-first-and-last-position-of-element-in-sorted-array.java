class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n = nums.length;
        int l=0;
        int r=n-1;
        int m=0;
        int fs=-1,la=-1;
        while(l<=r){
            m=l+(r-l)/2;
            if(nums[m]==target){
                fs=m;
                r=m-1;
            }
            else if(nums[m]<target){
                l=m+1;
            }
            else{
                r=m-1;
            }
        }
        l=0;
        r=n-1;
         while(l<=r){
            m=l+(r-l)/2;
            if(nums[m]==target){
             la=m;
             l=m+1;
            }
            else if(nums[m]<target){
                l=m+1;
            }
            else{
                r=m-1;
            }
        }

        return new int[]{fs,la};
    }
}