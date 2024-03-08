class Solution {
    public boolean isGood(int[] arr) {
        int i;
        int n=arr.length;
        if(n==1) return false;
        int ans=n-1;
        for(i=0;i<n;i++){
            if(arr[i]>n){
                return false;
            }
        }
        HashMap<Integer,Integer>hm=new HashMap<>();
        for(i=0;i<arr.length;i++){
            hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);
        }
        int cnt=0;
        for(Map.Entry h1:hm.entrySet()){
            if((int)h1.getValue()==2){
                cnt++;
            }
        }
         for(Map.Entry h1:hm.entrySet()){
            if((int)h1.getValue()>2){
                return false;
            }
        }
        int ans1=0;
        if(cnt>1) return false;
        for(Map.Entry h1:hm.entrySet()){
            if((int)h1.getValue()==2){
               ans1=(int)h1.getKey();
            }
        }
        if(ans==ans1) return true;
        return false;
    }
}