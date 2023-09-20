class Solution
{
    int onlyFirstAndLastAreSet(long n)
    {
        StringBuilder s=new StringBuilder();
        while(n>=1){
            s.append(n%2);
            n=n/2;
        }
        String str=s.reverse().toString();
        int c=0;
        int i;
        if(str.charAt(0)=='1' && str.charAt(str.length()-1)=='1'){
             c=c+2;
           }
        for(i=1;i<=str.length()-2;i++){
            if(str.charAt(i)=='1'){
               return 0;
            }
        }
        if(c==2){
            return 1;
        }
        return 0;
    }
}
