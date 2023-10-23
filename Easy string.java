class Solution 
{ 
    String transform(String S) 
    {
        String str=S.toLowerCase();
        int c=1;
        char arr[]=str.toCharArray();
        StringBuilder s=new StringBuilder();
        int i;
        if(S.length()==1){
            s.append(1);
            s.append(arr[0]);
            return s.toString();
        }
        for(i=0;i<arr.length-1;i++){
            if(arr[i]==arr[i+1]){
                c++;
            }
           if(arr[i]!=arr[i+1] || i==(arr.length-2)){
                s.append(c);
                s.append(arr[i]);
                c=1;
            }
        }
        if(arr[arr.length-2]!=arr[arr.length-1]){
            s.append(1);
            s.append(arr[arr.length-1]);
        }
        String str1=s.toString();
        return str1;
    }
} 