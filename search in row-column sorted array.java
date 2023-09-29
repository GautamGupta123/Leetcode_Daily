class Solution 
{ 
	static boolean search(int matrix[][], int n, int m, int x) 
	{  
	    // code here 
	    int i,j;
	    for(i=0;i<=n-1;i++){
	       for(j=0;j<=m-1;j++){
	           if(matrix[i][j]==x){
	               return true;
	           }
	       }
	    }
	    return false;
	} 
} 