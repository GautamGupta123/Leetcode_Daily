class Solution{
    int replaceBit(int N, int K){
        StringBuilder s=new StringBuilder();
        int i;
        int temp=N;
        while(temp>=1){
           s.append(temp%2);
           temp=temp/2;
        }
        String str=s.reverse().toString();
        if(K>str.length()){
            return N;
        }
        char arr[]=str.toCharArray();
        for(i=0;i<=arr.length-1;i++){
            if(i==(K-1)){
                arr[i]='0';
                break;
            }
        }
        StringBuilder s1=new StringBuilder();
        for(i=0;i<=arr.length-1;i++){
            s1.append(arr[i]);
        }
        String str1=s1.toString();
        int dec=0;
        int p=0;
        for(i=str1.length()-1;i>=0;i--){
            dec+=Character.getNumericValue(str1.charAt(i))*(int)Math.pow(2,p);
            p++;
        }   
        return dec;
    } 
}