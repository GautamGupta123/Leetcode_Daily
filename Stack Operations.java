class Geeks
{
    public static void insert(Stack<Integer> st, int x)
    {
        st.push(x);
    }
    public static void remove(Stack<Integer> st)
    {
        int x = st.pop();
        
    }
    public static void headOf_Stack(Stack<Integer> st)
    {
        int x=st.peek();
        System.out.println(x + " ");
    }
    public static void find(Stack<Integer> st, int val)
    {
    
        if(st.search(val)!=-1){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        
    }
}