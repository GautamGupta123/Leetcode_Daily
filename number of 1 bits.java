class Solution {
    static int setBits(int N) {
        if(N==0){
            return 0;
        }
        StringBuilder s=new StringBuilder();
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
        return c;
    }
}