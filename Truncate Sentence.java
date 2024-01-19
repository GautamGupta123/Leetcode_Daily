class Solution {
    public String truncateSentence(String s, int k) {
        int i;
        StringBuilder s1=new StringBuilder();
        for(i=0;i<s.length();i++){
            if(k==0) break;
            if(s.charAt(i)==' '){
                if(k==1){
                    k--;
                }
                else{
                s1.append(' ');
                k--;
                }
            }
            else{
                s1.append(s.charAt(i));
            }
        }
        return s1.toString();
    }
}