import java.util.*;
class GfG{
	public Stack<Integer> sort(Stack<Integer> s)
	{
		int arr[]=new int[s.size()];
		int i=0;
		while(!s.empty()){
		    arr[i]=s.pop();
		    i++;
		}
		for(i=0; i<=arr.length-1; i++){
            for(int j=0; j<=arr.length-i-2; j++){
            if(arr[j]>arr[j+1]){
                int temp = arr[j];
                arr[j]=arr[j+1];
                arr[j+1] = temp;
            }
        }
    }
		for(i=0;i<=arr.length-1;i++){
		    s.push(arr[i]);
		}
		return s;
	}
}