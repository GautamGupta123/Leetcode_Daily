class CheckBit
{
    static boolean checkKthBit(int n, int k)
    {
        StringBuilder s=new StringBuilder();
        String str;
        while(n>=1){
            s.append(n%2);
            n=n/2;
        }
        str=s.reverse().toString();
        int i;
        for(i=str.length()-1;i>=0;i--){
            if(i==str.length()-1-k){
                if(str.charAt(i)=='1')
                return true;
            }
        }
        return false;
    }
}