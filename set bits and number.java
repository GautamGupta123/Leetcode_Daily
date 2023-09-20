class Solution{
    static int bitMultiply(int N){
        StringBuilder s=new StringBuilder();
        int N1=N;
        while(N>=1){
            s.append(N%2);
            N=N/2;
        }
        String str=s.reverse().toString();
        int c=0,i;
        for(i=0;i<=str.length()-1;i++){
            if(str.charAt(i)=='1'){
                c++;
            }
        }
        int mul=c*N1;
        return mul;
    }
}