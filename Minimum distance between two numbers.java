class Solution {
    int minDist(int a[], int n, int x, int y) {
        int i;
        int flag=0;
        int flag1=0;
        int max=Integer.MAX_VALUE;
        int ans=0;
        for(i=0;i<=n-1;i++){
           if(a[i]==x){
               flag++;
           }
        }
         for(i=0;i<=n-1;i++){
           if(a[i]==y){
               flag1++;
           }
        }
        if(flag==0 || flag1==0){
            return -1;
        }
        int ind=-1;
        int ind1=-1;
        for(i=0;i<=n-1;i++){
            if(a[i]==x){
                ind=i;
            }
            else if(a[i]==y){
                ind1=i;
            }
            if(ind!=-1 && ind1!=-1){
                ans=Math.abs(ind-ind1);
                if(ans<max){
                    max=ans;
                }
            }
        }
        return max;
    }
}