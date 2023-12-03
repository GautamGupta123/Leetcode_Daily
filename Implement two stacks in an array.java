class twoStacks
{
    Stack<Integer>st=new Stack<Integer>();
    Stack<Integer>st1=new Stack<Integer>();
    
    twoStacks()
    {
        new Stack<Integer>();
        new Stack<Integer>();
    }
    //Function to push an integer into the stack1.
    void push1(int x)
    {
        st.push(x);
    }
    //Function to push an integer into the stack2.
    void push2(int x)
    {
       st1.push(x);
    }
    //Function to remove an element from top of the stack1.
    int pop1()
    {
        if(st.size()==0){
            return -1;
        }
        return st.pop();
    }
    //Function to remove an element from top of the stack2.
    int pop2()
    {
        if(st1.size()==0){
            return -1;
        }
        return st1.pop();
    }
}