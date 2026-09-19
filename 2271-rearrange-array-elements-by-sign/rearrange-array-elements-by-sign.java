class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int[] total = new int[n];
        int[] ans = new int[n/2];
        int[] res = new int[n/2];
        int positive=0,negative=0;
        for(int i=0; i<n; i++){
            if(nums[i]>0){
               ans[positive] = nums[i];
               positive++;
            }
            else{
                res[negative] = nums[i];
                negative++;
            }
        }
        int oddindex=0;
        int evenindex=0;
        for(int j=0; j<n; j++){
            if(j%2 == 0){
                total[j] = ans[oddindex];
                oddindex++;
            }
            else{
                total[j] = res[evenindex];
                evenindex++;
            }
        }
        return total;
    }
}