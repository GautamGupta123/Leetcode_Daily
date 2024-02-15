class Solution {
    public boolean canPlaceFlowers(int[] f, int n) {
        int i;
        int temp=n;
        if(n==0) return true;
        if(f.length==1 && f[0]==0){
            return true;
        }
        if(f[0]==0 && f[1]!=1){
            f[0]=1;
            temp--;
        }
        if(temp!=0){
        for(i=1;i<f.length-1;i++){
            if(temp==0) break;
            if(f[i]==1) continue;
            else if(f[i]==0 && f[i-1]!=1 && f[i+1]!=1){
                f[i]=1;
                temp--;
            }
        }
            if(temp!=0){
        if(f[f.length-1]==0 && f[f.length-2]!=1){
            f[f.length-1]=1;
            temp--;
         }
            }
        }
        if(temp==0) return true;
        return false;
    }
}