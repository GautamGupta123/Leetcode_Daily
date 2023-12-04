class Solution {
    public boolean isValid(String s) {
        int i;
        Stack<Character>st=new Stack<Character>();
        int flg=0;
        for(i=0;i<=s.length()-1;i++){
            if(s.charAt(i)=='(' || s.charAt(i)=='{' || s.charAt(i)=='['){
                flg++;
                st.push(s.charAt(i));
            }
            if((s.charAt(i)=='(' || s.charAt(i)=='{' || s.charAt(i)=='[') && i==(s.length()-1)){
                return false;
            }
            if((s.charAt(i)==')' || s.charAt(i)=='}' || s.charAt(i)==']') && st.size()==0){
                return false;
            }
            else if(s.charAt(i)==')' || s.charAt(i)=='}' || s.charAt(i)==']'){
               if(st.peek()=='(' && s.charAt(i)==')' && !st.empty()){
                   st.pop();
               }
               else if(st.peek()=='{' && s.charAt(i)=='}' && !st.empty()){
                   st.pop();
               }
              else if(st.peek()=='[' && s.charAt(i)==']' && !st.empty()){
                  st.pop();
              }
                else{
                    return false;
                }
            }
        }
        if(st.size()!=0){
            return false;
        }
        if(flg==s.length()){
            return false;
        }
        return true;
    }
}