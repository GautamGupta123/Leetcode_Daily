import java.util.*;
class Geeks{
    
    static void interchange(int a[][],int r, int c){
        
         ArrayList<Integer>ls=new ArrayList<Integer>();
         ArrayList<Integer>ls1=new ArrayList<Integer>();
         int i;
         int j;
         for(i=0;i<=r-1;i++){
            ls.add(a[i][0]);
         }
         for(i=0;i<=r-1;i++){
             ls1.add(a[i][c-1]);
         }
         for(i=0;i<=r-1;i++){
            a[i][0]=ls1.get(i);
         }
         for(i=0;i<=r-1;i++){
            a[i][c-1]=ls.get(i);
         }
        for(i = 0;i<r;i++){
            for(j = 0;j<c;j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        } 
    }
}