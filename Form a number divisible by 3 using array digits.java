class Solution {
    static int isPossible(int N, int arr[]) {
        int i;
        StringBuilder s=new StringBuilder();
        for(i=0;i<=N-1;i++){
            s.append(arr[i]);
        }
        String str=s.toString();
        char ans[]=str.toCharArray();
        int sum=0;
        for(i=0;i<=ans.length-1;i++){
            sum+=ans[i];
        }
        if(sum%3==0){
            return 1;
        }
        return 0;
    }
}