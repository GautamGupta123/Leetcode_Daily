class Solution {
    public static boolean isprime(int i){
        StringBuilder s=new StringBuilder();
        while(i>=1){
            s.append(i%2);
            i=i/2;
        }
        String str=s.reverse().toString();
        int c=0;
        for(i=0;i<=str.length()-1;i++){
            if(str.charAt(i)=='1'){
                c++;
            }
        }
        int t;
        if(c==1){
            return false;
        }
        for(t=2;t*t<=c;t++){
            if(c%t==0) return false;
        }
        return true;
    }
    public int countPrimeSetBits(int left, int right) {
        int i;
        int c=0;
        for(i=left;i<=right;i++){
            if(isprime(i)==true){
                c++;
            }
        }
        return c;
    }
}