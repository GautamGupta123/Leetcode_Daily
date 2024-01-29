class Solution {
    public int countKeyChanges(String s) {
        int i;
        int cnt=0;
        for(i=0;i<s.length()-1;i++){
            if((s.charAt(i)+(char)32==s.charAt(i+1)) || (s.charAt(i)-(char)32==s.charAt(i+1) || s.charAt(i)==s.charAt(i+1))){
                continue;
            }
            else{
                cnt++;
            }
        }
        return cnt;
    }
}