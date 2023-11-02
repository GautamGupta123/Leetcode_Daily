class Solution
{
    static boolean isIsogram(String data){
        char arr[]=data.toCharArray();
        int flag=0;
        int i;
        Arrays.sort(arr);
        for(i=0;i<arr.length-1;i++){
            if(arr[i]!=arr[i+1]){
                flag++;
            }
            if(arr[i]==arr[i+1]){
                return false;
            }
        }
        if(flag==(arr.length-1)){
            return true;
        }
        return false;
    }
}