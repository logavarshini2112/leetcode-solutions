class Solution {
    public int differenceOfSums(int n, int m) {
        int total1=0;
        int total2=0;

       
        for(int i=1;i<=n;i++){
            if(i%m!=0){
                total1=total1+i;
            }
            else{
                total2=total2+i;
            }


        }
        int answer=total1-total2;
        return answer;
    }
}