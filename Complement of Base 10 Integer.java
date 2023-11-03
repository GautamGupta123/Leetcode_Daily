class Solution {
    public int bitwiseComplement(int num) {
        StringBuilder s=new StringBuilder();
        if(num==0){
            return 1;
        }
        while(num>=1){
            s.append(num%2);
            num=num/2;
        }
        int i;
        String str=s.reverse().toString();
        StringBuilder s1=new StringBuilder();
        for(i=0;i<=str.length()-1;i++){
            if(str.charAt(i)=='1'){
               s1.append(0);
            }
            else{
                s1.append(1);
            }
        }
        String str1=s1.toString();

        int p=0;
        int dec=0;
         for(i=str1.length()-1;i>=0;i--){  
           dec+=Character.getNumericValue(str1.charAt(i))*(int)Math.pow(2,p);
             p++;
         }

        return dec;
    }
}