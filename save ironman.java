
class Complete{
    public static boolean saveIronman (String s) {
         s=s.toLowerCase();
        int i;
        StringBuilder s1=new StringBuilder();
        for(i=0;i<=s.length()-1;i++){
            if(s.charAt(i)>='a' && s.charAt(i)<='z' || s.charAt(i)>='0' && s.charAt(i)<='9'){
            s1.append(s.charAt(i));
            }
        }
        String str=s1.toString();
        //System.out.print(str);
        char arr[]=str.toCharArray();
        int j=arr.length-1;
        i=0;
        int flag=0;
        if(arr.length%2!=0){
        while(i<=j){
            if(i==j){
                flag++;
                break;
            }
            if(arr[i]==arr[j]){
                flag+=2;
            }
            else{
                return false;
            }
            i++;
            j--;
        }
        if(flag==arr.length){
            return true;
        }
       }
       else{
       while(i<j){
            if(arr[i]==arr[j]){
                flag+=2;
            }
            else{
                return false;
            }
            i++;
            j--;
        }
        if(flag==arr.length){
            return true;
        }
        
    }
    return false;
    }
}