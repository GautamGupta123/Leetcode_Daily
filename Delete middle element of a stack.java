import java.util.*;
class Solution
{
    public void deleteMid(Stack<Integer>s,int sizeOfStack){
        Stack<Integer>st=new Stack<Integer>();
        int mid;
        if(s.size()%2==0){
             mid=(int)Math.floor(s.size()/2);
             int i=1;
             while(i<=mid+1){
            st.push(s.pop());
            i++;
            }
        }
        else{
         mid=(int)Math.floor((s.size()+1)/2);
         int i=1;
         while(i<=mid){
            st.push(s.pop());
            i++;
        }
        }
        
        
        int t=st.peek();
        st.pop();
        while(!st.empty()){
            s.push(st.pop());
        }
    } 
}