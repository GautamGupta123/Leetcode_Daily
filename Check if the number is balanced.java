class Sol
{
    Boolean balancedNumber(String N)
    {
        int i;
        int left=0;
        int right=0;
        char arr[]=N.toCharArray();
        for(i=0;i<arr.length/2;i++){
            left+=arr[i];
        }
        for(i=(arr.length/2)+1;i<=arr.length-1;i++){
            right+=arr[i];
        }
        if(left==right){
            return true;
        }
        return false;
    }
}