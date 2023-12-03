class Solution
{ 
    static void reverse(Stack<Integer> s)
    {
        int arr[]=new int[s.size()];
        int i=0;
        while(!s.empty()){
            arr[i]=s.pop();
            i++;
        }
        for(i=0;i<=arr.length-1;i++){
            s.push(arr[i]);
        }
    }
}