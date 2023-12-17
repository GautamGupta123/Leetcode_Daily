class Solution
{
    public int[] singleNumber(int[] arr)
    {
        Arrays.sort(arr);
        int i;
        int n=arr.length;
        ArrayList<Integer>ls=new ArrayList<Integer>();
        if(arr[0]!=arr[1]){
            ls.add(arr[0]);
        }
        for(i=1;i<n-1;i++){
            if(arr[i]!=arr[i-1] && arr[i]!=arr[i+1]){
                ls.add(arr[i]);
            }
        }
        if(arr[n-1]!=arr[n-2]){
            ls.add(arr[n-1]);
        }
        int ans[]=new int[2];
        for(i=0;i<=ls.size()-1;i++){
            ans[i]=ls.get(i);
        }
        Arrays.sort(ans);
        return ans;
    }
}