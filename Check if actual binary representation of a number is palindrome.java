

//User function Template for Java

class Sol
{
    int binaryPalin (long N)
    {
        long rem;
        StringBuilder s=new StringBuilder();
        while(N>=1){
            rem=N%2;
            s.append(rem);
            N=N/2;
        }
        String str=s.reverse().toString(); 
        int c=0;
        char arr[]=str.toCharArray();
        int i=0;
        int j=arr.length-1;
        if(arr.length%2!=0){
        while(i<=j){
            if(i==j){
                c+=1;
            }
            else if(arr[i]==arr[j]){
                c=c+2;
            }
            i++;
            j--;
        }
        if(c==arr.length){
            return 1;
        }
      }
      else if(arr.length%2==0){
          while(i<j){
            if(arr[i]==arr[j]){
                c=c+2;
            }
            i++;
            j--;
        }
        if(c==arr.length){
            return 1;
        }
      }
      return 0;
    }
}