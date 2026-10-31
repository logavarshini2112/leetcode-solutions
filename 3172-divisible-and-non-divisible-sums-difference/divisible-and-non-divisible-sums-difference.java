class Solution {
    public int differenceOfSums(int n, int m) {
        int sum=0;
        for(int i=0;i<=n;i++){
            sum=sum+i;
        }
        int total=0;
        for(int i=0;i<=n;i++){
            if(i%m==0){
                total=total+i;
            }

        }
        int answer=sum-(2*total);
        return answer;
    }
}