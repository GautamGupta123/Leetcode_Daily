class Solution{
    String modify(String s){
        String ans;
        if(s.charAt(0)>='a' && s.charAt(0)<='z'){
            ans=s.toLowerCase();
        }
        else{
            ans=s.toUpperCase();
        }
        return ans;
    }
}