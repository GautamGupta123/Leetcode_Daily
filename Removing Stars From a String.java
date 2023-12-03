import java.util.*;
class Solution {
    public String removeStars(String s) {
        Stack<Character>st=new Stack<Character>();
        Stack<Character>st1=new Stack<Character>();
        int i;
        for(i=s.length()-1;i>=0;i--){
            st.push(s.charAt(i));
        }
        while(!st.empty()){
            if(st.peek()!='*'){
                st1.push(st.pop());
            }
            else if(st.peek()=='*'){
                st.pop();
                st1.pop();
            }
        }
        while(!st1.empty()){
            st.push(st1.pop());
        }
        StringBuilder sb=new StringBuilder();
        while(!st.empty()){
            sb.append(st.pop());
        }
        return sb.toString();
    }
}