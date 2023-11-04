class GfG {
    int convertfive(int num) {
        int a=num;
        int i;
        int rem;
        StringBuilder s=new StringBuilder();
        while(a!=0){
            rem=a%10;
            if(rem!=0){
                s.append(rem);
            }
            else if(rem==0){
                s.append(5);
            }
            a=a/10;
        }
        String str=s.reverse().toString();
        int d=0;
        int p=str.length()-1;
        for(i=0;i<=str.length()-1;i++){
            d+=Character.getNumericValue(str.charAt(i))*(int)Math.pow(10,p);
            p--;
        }
        return d;
    }
}