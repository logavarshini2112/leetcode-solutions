class Solution {
    public boolean isPalindrome(int x) {
        int temp = x;
        if(x<0){
            return false;
        }
        int org = x;
        int rev=0;
        int digit;
     
        while(temp!=0){
             digit = temp%10;
             rev = rev*10+digit;
            temp = temp/10;
        }
        if(rev == org){
            return true;
        }
        else{
            return false;
        }
    }
}