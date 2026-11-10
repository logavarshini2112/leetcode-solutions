class Solution {
    public boolean isPowerOfFour(int n) {
        if(n==1){
            return true;
        }
        int result=0;
        for(int i=0; i<=15; i++){
            result = (int)Math.pow(4,i);
            if(result==n){
                return true;
            }
        }
        return false;
    }
}