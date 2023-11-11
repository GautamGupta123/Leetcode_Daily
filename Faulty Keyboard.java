class Solution {
    public String rev(String ans){
        int i;
        String a="";
        for(i=ans.length()-1;i>=0;i--){
            a+=ans.charAt(i);
        }
        return a;
    }
    public String finalString(String s) {
        String ans="";
        int i;
        String p="";
        for(i=0;i<=s.length()-1;i++){
            if(s.charAt(i)=='i'){
                p=rev(ans);
                ans="";
                ans+=p;
            }
            else{
                ans+=s.charAt(i);
            }
        }
        return ans;
    }
}