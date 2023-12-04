class GfG
{
    int minEle;
    Stack<Integer> s;
    ArrayList<Integer>ls=new ArrayList<Integer>();
    // Constructor    
    GfG()
	{
       ArrayList<Integer>ls=new ArrayList<Integer>();
	}
	
    /*returns min element from stack*/
    int getMin()
    {
	// Your code here
	    int i;
	    if(ls.size()==0){
	        return -1;
	    }
	   int min=Integer.MAX_VALUE;
	   for(i=ls.size()-1;i>=0;i--){
	       if(ls.get(i)<min){
	           min=ls.get(i);
	       }
	   }
	   
	   return min;
    }
    
    /*returns poped element from stack*/
    int pop()
    {
	// Your code here
	 if(ls.size()==0){
	     return -1;
	 }
	   return ls.remove(ls.size()-1);
    }

    /*push element x into the stack*/
    void push(int x)
    {
	// Your code here	
	    ls.add(x);
    }	
}