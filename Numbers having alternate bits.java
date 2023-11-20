class Solution {
    static long bitsAreInAltOrder(long n){
        StringBuilder s=new StringBuilder();
        while(n>=1){
            s.append(n%2);
            n=n/2;
        }
        String str=s.toString();
        int i;
        int flag=0;
        for(i=0;i<str.length()-2;i=i+2){
            if(str.charAt(i)=='0' && str.charAt(i+1)=='1'){
                flag++;
            }
        }
        if(str.charAt(str.length()-2)=='0' && str.charAt(str.length()-1)=='1'){
            flag++;
        }
        int flag1=0;
        for(i=0;i<str.length()-2;i=i+2){
            if(str.charAt(i)=='1' && str.charAt(i+1)=='0'){
                flag1++;
            }
        }
         if(str.charAt(str.length()-2)=='1' && str.charAt(str.length()-1)=='0'){
            flag1++;
        }
        if(flag==(str.length()-1) || flag1==(str.length()-1))
        {
            return 1;
        }
        return 0;
    }
}