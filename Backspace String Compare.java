import java.util.*;
class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character>s1=new Stack<Character>();
        int i;
        Stack<Character>s2=new Stack<Character>();
        for(i=0;i<=s.length()-1;i++){
            if(s.charAt(i)!='#'){
                s1.push(s.charAt(i));
            }
            if(s.charAt(i)=='#' && !s1.empty()){
                s1.pop();
            }
        }
         for(i=0;i<=t.length()-1;i++){
            if(t.charAt(i)!='#'){
                s2.push(t.charAt(i));
            }
            if(t.charAt(i)=='#' && !s2.empty()){
                s2.pop();
            }
        }
        StringBuilder sb=new StringBuilder();
        StringBuilder sb1=new StringBuilder();
        while(!s1.empty()){
            sb.append(s1.pop());
        }
        while(!s2.empty()){
            sb1.append(s2.pop());
        }
        if(sb.toString().equals(sb1.toString())){
            return true;
        }
        return false;
    }
}