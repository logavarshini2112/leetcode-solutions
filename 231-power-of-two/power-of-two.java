class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n==1){
            return true;
        }
        int result=0;
        for(int i=0;i<=30;i++){
            result = (int)Math.pow(2,i);
            if(result == n){
                return true;
            }
        }
        return false;
        
    }
}