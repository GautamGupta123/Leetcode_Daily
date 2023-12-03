public static Stack<Integer>_push(ArrayList<Integer> arr,int n)
{
    int i;
    Stack<Integer>s=new Stack<Integer>();
    for(i=0;i<=n-1;i++){
        s.push(arr.get(i));
    }
    return s;
}

public static void _pop(Stack<Integer>s)
{
    while(!s.empty()){
      System.out.print(s.pop()+" ");
    }
}