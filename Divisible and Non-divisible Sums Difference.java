class Solution {
    public int differenceOfSums(int n, int m) {
        int sum=0;
        int i;
        for(i=1;i<=n;i++){
            if(i%m!=0){
                sum+=i;
            }
        }
        int sum1=0;
        for(i=1;i<=n;i++){
            if(i%m==0){
                sum1+=i;
            }
        }
         return sum-sum1;       
    }
}