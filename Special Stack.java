class GfG{
	public void push(int a,Stack<Integer> s)
	{
	    s.push(a);
	}
	public int pop(Stack<Integer> s)
        {
            return s.pop();
	}
	public int min(Stack<Integer> s)
    {
           int min1=Integer.MAX_VALUE;
           while(!s.empty()){
               if(s.peek()<min1){
                   min1=s.peek();
               }
               s.pop();
           }
           return min1;
	}
	public boolean isFull(Stack<Integer>s, int n)
    {
           if(s.size()==n){
               return true;
           }
           return false;
	}
	public boolean isEmpty(Stack<Integer>s)
    {
           return s.empty();
	}
}