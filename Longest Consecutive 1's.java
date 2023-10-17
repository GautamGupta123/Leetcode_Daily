class Solution{
    public static int maxConsecutiveOnes(int N) {
        StringBuilder s=new StringBuilder();
        int rem,i;
        while(N!=0){
            rem=N%2;
            s.append(rem);
            N=N/2;
        }
        String str=s.reverse().toString();
        int longest=-1;
        int c=1;
        for(i=0;i<str.length()-1;i++){
            if(str.charAt(i)=='1' && str.charAt(i+1)=='1'){
                c++;
                if(c>longest){
                    longest=c;
                }
            }
            else if(str.charAt(i)=='0' && str.charAt(i+1)=='1'){
                c=1;
                if(c>longest){
                    longest=c;
                }
            }
            else if(str.charAt(i)=='0' && str.charAt(i+1)=='0'){
                c=1;
                if(c>longest){
                    longest=c;
                }
            }
            else if(str.charAt(i)=='1' && str.charAt(i+1)=='0'){
                c=1;
                if(c>longest){
                    longest=c;
                }
            }
        }
        return longest;
    }
}