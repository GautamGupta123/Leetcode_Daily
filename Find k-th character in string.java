class Solution {
    char kthCharacter(int m, int n, int k) {
       StringBuilder s=new StringBuilder();
       int i,j;
       if(m==0 && n==0){
           return '0';
       }
       while(m>=1){
           s.append(m%2);
           m=m/2;
       }
       String str=s.reverse().toString();
        if(m==0){
            s.append(m);
           str=s.toString();
       }
       for(i=1;i<=n;i++){
           StringBuilder s1=new StringBuilder();
           for(j=0;j<=str.length()-1;j++){
               if(str.charAt(j)=='1'){
                   s1.append("10");
               }
               else{
                   s1.append("01");
               }
           }
           str=s1.toString();
       }
       char ans=' ';
        for(i=0;i<=str.length()-1;i++){
            if(i==(k-1)){
                ans=str.charAt(i);
                break;
            }
        }
        return ans;
    }
}