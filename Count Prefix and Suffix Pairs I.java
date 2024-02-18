class Solution {
    public boolean isprefix(String str,String str1){
        int n=str.length();
        int m=str1.length();
        int c=0;
        if(n>m) return false;
        int i;
        for(i=0;i<str.length();i++){
            if(str.charAt(i)==str1.charAt(i)){
               c++;
            }
        }
        if(c==n) return true;
        return false;
    }
    public boolean issuffix(String str,String str1){
        int n=str.length();
        int m=str1.length();
        int c=0;
        if(n>m) return false;
        int i,j=m-1;
        for(i=n-1;i>=0;i--){
            if(str.charAt(i)==str1.charAt(j)){
                c++;
                j--;
            }
        }
        if(c==n) return true;
        return false;
    }
    public int countPrefixSuffixPairs(String[] words) {
        int i;
        int j;
        int cnt=0;
        int n=words.length;
        for(i=0;i<n-1;i++){
            for(j=i+1;j<n;j++){
                if(isprefix(words[i],words[j])==true && issuffix(words[i],words[j])==true){
                    cnt++;
                }
            }
        }
        return cnt;
    }
}