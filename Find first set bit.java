class Solution
{
    public static int getFirstSetBit(int n){
            
        // Your code here
         StringBuilder s=new StringBuilder();
         while(n>=1){
             s.append(n%2);
             n=n/2;
         }
         String str=s.reverse().toString();
         int c=0;
         int ind=0;
         int flag=0;
         int i;
         for(i=str.length()-1;i>=0;i--){
             c++;
             if(str.charAt(i)=='1'){
                // c++;
                 ind=c;
                 flag++;
                 break;
             }
         }
         if(flag==0){
             return 0;
         }
         return ind;
    }
}