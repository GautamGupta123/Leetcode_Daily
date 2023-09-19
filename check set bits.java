class Solution{
    static int isBitSet(int N){
        if(N==0){
            return 0;
        }
        StringBuilder s=new StringBuilder();
        while(N>=1){
            s.append(N%2);
            N=N/2;
        }
        String str=s.reverse().toString();
        int i;
        int flag=0;
        for(i=0;i<=str.length()-1;i++){
            if(str.charAt(i)=='0'){
                return 0;
            }
            else if(str.charAt(i)=='1'){
                flag++;
            }
        }
        if(flag==str.length()){
           return 1;
        }
        return 0;
    }
}