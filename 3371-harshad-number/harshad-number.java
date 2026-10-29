class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int num = x;
        int digit=0;
        int sum=0;
        int n=-1;
        while(num>0){
           digit=num%10;
           sum=sum+digit;
           num=num/10;
        }
        if(x%sum ==0){
            return sum;
        }
        return n;
    }
}