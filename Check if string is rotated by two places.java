class Solution
{
    public static boolean isRotated(String str1, String str2)
    {
        if(str1.length()!=str2.length()){
            return false;
        }
        StringBuilder s=new StringBuilder();
        int i;
        for(i=0;i<=str2.length()-1;i++){
            s.append(str2.charAt(i));
        }
        String str=s.toString();
        int d=2;
        char last;
        char arr[]=str2.toCharArray();
        //right rotation
        while(d!=0){
            last=arr[arr.length-1];
            for(i=str2.length()-2;i>=0;i--){
                arr[i+1]=arr[i];
            }
            arr[0]=last;
            d--;
        }
        StringBuilder s1=new StringBuilder();
        for(i=0;i<=arr.length-1;i++){
            s1.append(arr[i]);
        }
        String s8=s1.toString();
        if(s8.equals(str1)){
            return true;
        }
        else{
            //left rotation
            int p1=2;
            char arr1[]=str.toCharArray();
            while(p1!=0){
            last=arr1[0];
            for(i=1;i<=arr1.length-1;i++){
                arr1[i-1]=arr1[i];
            }
            arr1[arr1.length-1]=last;
            p1--;
        }
         StringBuilder s2=new StringBuilder();
        for(i=0;i<=arr1.length-1;i++){
            s2.append(arr1[i]);
        }
        String ss=s2.toString();
        if(ss.equals(str1)){
          return true;
       }
      }
      return false;
    }
    
}