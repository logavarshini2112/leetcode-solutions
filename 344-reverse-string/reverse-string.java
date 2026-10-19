class Solution {
    public void reverseString(char[] s) {
        int n= s.length;
        char[] rev=new char[n];
        int i,j;
        for(i=0,j=n-1;j>=0;i++,j--){
            rev[i]=s[j];
        }
        for(i=0; i<n; i++){
            s[i]=rev[i];
        }
    }
}