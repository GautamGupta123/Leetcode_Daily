import java.util.*;
class Solution {
    
    public pair indexes(long v[], long x)
    {
        // Your code goes here
        int i;
        int firs=-1;
        int secon=-1;
        for(i=0;i<=v.length-1;i++){
            if(v[i]==x && i==0){
                firs=i;
               
            }
            else if(v[i]==x && v[i-1]!=x){
                firs=i;
            }
            if(v[i]==x && i==(v.length-1)){
                secon=i;
                break;
            }
            else if(v[i]==x && v[i+1]!=x){
                secon=i;
            }
        }
        pair p=new pair(firs,secon);
        return p;
    }
}