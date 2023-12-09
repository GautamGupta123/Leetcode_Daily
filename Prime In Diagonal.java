class Solution {
    public static boolean isprime(int p){
        int i;
        for(i=2;i*i<=p;i++){
            if(p%i==0){
                return false;
            }
        }
        return true;
    }
    public int diagonalPrime(int[][] nums) {
        int n=nums.length;
        int i;
        int j;
        ArrayList<Integer>ls=new ArrayList<Integer>();
        for(i=0;i<=n-1;i++){
                    int p=nums[i][i];
                    if(isprime(p)==true){
                        ls.add(p);
                    } 
        }
        for(i=0;i<=n-1;i++){
                int t=nums[i][n-i-1];
                if(isprime(t)==true){
                    ls.add(t);
                }
            }
        int max=Integer.MIN_VALUE;
    for(i=0;i<=ls.size()-1;i++){
        if(ls.get(i)>max){
            max=ls.get(i);
        }
    }
        if(max==Integer.MIN_VALUE || max==1){
            return 0;
        }
    return max;
    }
}