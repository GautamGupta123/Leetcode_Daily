class Solution {
    static int findPosition(int N) {
        if(N==0){
            return -1;
        }
        StringBuilder s=new StringBuilder();
        while(N>=1){
            s.append(N%2);
            N=N/2;
        }
        String str=s.reverse().toString();
        int i;
        int c=0;
        int pos=0;
        
        for(i=str.length()-1;i>=0;i--){
            if(str.charAt(i)=='1'){
                c++;
            }
        }
        if(c>1){
            return -1;
        }
        else{
           for(i=str.length()-1;i>=0;i--){
            if(str.charAt(i)=='1'){
                pos=pos+1;
            }
           else{
               pos++;
           }
        }
        
        }
        return pos;
    }
};