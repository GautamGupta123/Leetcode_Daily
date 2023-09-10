class Solution {
    public char repeatedCharacter(String s) {
        int i,j;
        int n=s.length();
        int min=Integer.MAX_VALUE;
        char c=' ';
        int smin=Integer.MAX_VALUE;
        for(i=0;i<n-1;i++){
            for(j=i+1;j<=n-1;j++){
                if(s.charAt(i)==s.charAt(j)){
                    min=j;
                    if(min<smin){
                        c=s.charAt(i);
                        smin=min;
                    }
                }
            }
        }
        return c;
    }
}