class Solution {
    public boolean checkRecord(String s) {
        int i;
        int cnt=0;
        for(i=0;i<s.length();i++){
            if(s.charAt(i)=='A') cnt++;
        }
        int cnt1=1;
        for(i=0;i<s.length()-1;i++){
            if(cnt1==3) return false;
            if(s.charAt(i)==s.charAt(i+1) && s.charAt(i)=='L' && s.charAt(i+1)=='L') cnt1++;
            else if(s.charAt(i)=='L' && cnt1!=1 && s.charAt(i+1)!='L') cnt1=1;
        }
        if(cnt<2 && cnt1<3) return true;
        return false;
    }
}