class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result = new ArrayList<>();
        HashSet<Integer> res = new HashSet<>();
        int n = nums.length;
          for(int a : nums){
            res.add(a);
          }
          for(int i=1; i<=n; i++){
             if(!res.contains(i)){
                result.add(i);             }
          }
          return result;
    }
}