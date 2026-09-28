
class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int n = nums.length;
        HashMap<Integer,Integer> set = new HashMap<>();
        for(int i=0; i<n; i++){
            if(set.containsKey(nums[i])){
               int previousindex = set.get(nums[i]);
               if((i-previousindex) <= k){
                return true;
               }
            }
            set.put(nums[i],i);
        }
        return false;
    }
}