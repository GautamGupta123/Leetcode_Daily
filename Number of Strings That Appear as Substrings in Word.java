class Solution {
    public boolean findpat(String str,String w){
        if(w.contains(str)){
            return true;
        }
        return false;
    }
    public int numOfStrings(String[] patterns, String word) {
        int i,j;
        int cnt=0;
        int n=patterns.length;
        for(i=0;i<n;i++){
            if(findpat(patterns[i],word)==true){
                cnt++;
            }
        }
        return cnt;
    }
}