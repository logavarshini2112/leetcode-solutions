class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        // int n = nums.length;
        HashSet<Integer> set1 = new HashSet<>();
        for(int a : nums1){
            set1.add(a);
        }
        HashSet<Integer> set2 = new HashSet<>();
        for(int b : nums2){
            if(set1.contains(b)){
                set2.add(b);
            }
        }
        int[] answer = new int[set2.size()];
        int index=0;
        for(int c : set2){
            answer[index] = c;
            index++;
        }
        return answer;
    }
}