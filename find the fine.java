class Solution {
    public long totalFine( long n, long date, long car[], long fine[])
    {
        int i;
        long f=0;
        if(date%2==0){
            for(i=0;i<=car.length-1;i++){
                if(car[i]%2!=0){
                    f+=fine[i];
                }
            }
        }
        else{
            for(i=0;i<=car.length-1;i++){
                if(car[i]%2==0){
                    f+=fine[i];
                }
            }
        }
        return f;
    }
}