import java.util.*;
class Solution {
    public Stack<Integer> insertAtBottom(Stack<Integer> St, int X) {
        Stack<Integer>s=new Stack<Integer>();
        while(!St.empty()){
            s.push(St.pop());
        }
        St.push(X);
        while(!s.empty()){
            St.push(s.pop());
        }
        return St;
    }
}