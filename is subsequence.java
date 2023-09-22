class Solution {
    public boolean isSubsequence(String s, String t) {
        int i,j;
        int n=s.length();
        int m=t.length();
        int ind=0;
        int flag=0;
        for(i=0;i<=n-1;i++){
            for(j=ind+1;j<=m;j++){
            
                if(s.charAt(i)==t.charAt(j-1)){
                    ind=j;
                    flag++;
                    break;
                }
            }
        }
           if(flag==n){
               return true;
           }
        return false;
    }
}