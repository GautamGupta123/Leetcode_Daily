class Solution {
    
    public String reverse(String S){
       StringBuilder s=new StringBuilder();
       int i;
       for(i=S.length()-1;i>=0;i--){
           s.append(S.charAt(i));
       }
       String str=s.toString();
       return str;
    }

}