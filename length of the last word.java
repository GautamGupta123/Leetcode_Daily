class Solution {
    public int lengthOfLastWord(String s) {
        int i;
        int c=0;
        int n=s.length();
        for(i=n-1;i>=0;i--){
            if(s.charAt(i)>='a' && s.charAt(i)<='z' || s.charAt(i)>='A' && s.charAt(i)<='Z'){
                c++;
            }
        if(i!=0){
            if((s.charAt(i)>='a' && s.charAt(i)<='z' || s.charAt(i)>='A' && s.charAt(i)<='Z') && s.charAt(i-1)==' '){
                break;
            }
        }
            if(i==0){
                break;
            }
        }
        return c;
    }
}