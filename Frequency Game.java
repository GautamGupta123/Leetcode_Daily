class Solution {
    public static int LargButMinFreq(int arr[], int n) {
        HashMap<Integer,Integer>hm=new HashMap<>();
        int i;
        for(i=0;i<=n-1;i++){
            hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);
        }
        int min=Integer.MAX_VALUE;
        for(Map.Entry m:hm.entrySet()){
            if((int)m.getValue()<=min){
                min=(int)m.getValue();
            }
        }
        int max=Integer.MIN_VALUE;
        for(Map.Entry m:hm.entrySet()){
            if((int)m.getValue()==min && (int)m.getKey()>=max){
                max=(int)m.getKey();
            }
        }
        return max;
    }
}