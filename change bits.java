class Solution {
    static int[] changeBits(int N) {
        // code her
        StringBuilder s=new StringBuilder();
        int temp=N;
        while(temp>=1){
            s.append(temp%2);
            temp=temp/2;
        }
        String str=s.reverse().toString();
        int i;
        char arr[]=str.toCharArray();
        for(i=0;i<=str.length()-1;i++){
            if(arr[i]=='0'){
                arr[i]='1';
            }
        }
        StringBuilder s1=new StringBuilder();
        for(i=0;i<=arr.length-1;i++){
            s1.append(arr[i]);
        }
        int ans[]=new int[2];
        String str1=s1.toString();
        
        int dec=0;
        int n=0;
        for(i=str1.length()-1;i>=0;i--){
            dec+=Character.getNumericValue(str1.charAt(i))*(int)Math.pow(2,n);
            n++;
        }
        ans[1]=dec;
        int a=Math.abs(N-dec);
        ans[0]=a;
        return ans;
    }
};