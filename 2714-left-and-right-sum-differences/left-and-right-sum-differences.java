class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n=nums.length;
        int[] answer = new int[n];
        
        int rightsum=0;
        for(int i=0; i<n; i++){
           
            rightsum=rightsum+nums[i];
    
        } 
         int leftsum=0;
        for(int i=0; i<n; i++){
            rightsum=rightsum-nums[i];
            answer[i]=Math.abs(leftsum-rightsum);
            leftsum=leftsum+nums[i];
        }
        return answer;
    }
}