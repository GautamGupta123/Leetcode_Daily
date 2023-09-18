class Solution {
    public int[] evenOddBit(int n) {
        int i;
        StringBuilder s=new StringBuilder();
        int ans[]=new int[2];
        while(n>=1){
            s.append(n%2);
            n=n/2;
        }
        int e=0;
        int o=0;
        String str=s.toString();
        for(i=0;i<=str.length()-1;i++){
            if(str.charAt(i)=='1' && i%2==0){
                e++;
            }
            else if(str.charAt(i)=='1' && i%2!=0){
                o++;
            }
        }
        ans[0]=e;
        ans[1]=o;
        return ans;
    }
}