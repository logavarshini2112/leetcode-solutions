class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int num = x;
        int digit=0;
        int sum=0;
        while(num>0){
           digit=num%10;
           sum=sum+digit;
           num=num/10;
        }
        if(x%sum ==0){
            return sum;
        }
        return -1;
    }
}