class Solution {
    public boolean isPowerOfThree(int n) {
        if(n==1){
            return true;
        }
        int result=0;
        for(int i=0; i<=19; i++){
           result=(int)Math.pow(3,i);
           if(result==n){
             return true;
           }
        }
        return false;
    }
}