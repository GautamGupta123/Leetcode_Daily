class Solution {
    static int setAllRangeBits(int N , int L , int R) {
        StringBuilder s=new StringBuilder();
        int i;
        int temp=N;
        while(temp>=1){
            s.append(temp%2);
            temp=temp/2;
        }
        String str=s.toString();
        char arr[]=str.toCharArray();
        for(i=L-1;i<=R-1;i++){
           arr[i]='1';
        }
        StringBuilder s1=new StringBuilder();
        for(i=0;i<=arr.length-1;i++){
            s1.append(arr[i]);
        }
      String str1=s1.reverse().toString();
      int dec=0;
      int p=0;
      //System.out.print(str1);
      for(i=str1.length()-1;i>=0;i--){
          dec+=Character.getNumericValue(str1.charAt(i))*(int)Math.pow(2,p);
          p++;
      }
      return dec;
    }
};