class Solution {
    public boolean isPerfectSquare(int num) {
        int m;
        for(int  i=1; i<=num/i; i++){
             m = i*i;
            if(m == num){
                return true;
            }
        }
        return false;
    }
}