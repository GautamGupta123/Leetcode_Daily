class Solution {
    public int sumBase(int n, int k) {
        StringBuilder s=new StringBuilder();
        while(n>=1){
            s.append(n%k);
            n=n/k;
        }
        int d=0;
        String str=s.toString();
        int i;
        int p=str.length()-1;
        for(i=0;i<=str.length()-1;i++){
            d+=Character.getNumericValue(str.charAt(i))*(int)Math.pow(10,p);
            p--;
        }
        int sum=0;
        while(d>0){
            sum+=d%10;
            d=d/10;
        }
        return sum;
    }
}