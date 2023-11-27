class Solution{
    static String checkFibonacci(int N){
        long first=1;
        long second=1;
        if((long)N==first || (long)N==second){
            return "Yes";
        }
        int i=1;
        long ans=0;
        while(i<=(N+1)){
            ans=first+second;
            if(ans==N){
                return "Yes";
            }
            first=second;
            second=ans;
            i++;
        }
        return "No";
    }
}