class Solution {
    int[] repeatingEven(int[] arr, int n) {
        HashMap<Integer,Integer>hm=new HashMap<>();
        int i;
        for(i=0;i<n;i++){
            hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);
        }
        ArrayList<Integer>ls=new ArrayList<>();
        for(Map.Entry m1:hm.entrySet()){
            if((int)m1.getValue()%2==0){
                ls.add((int)m1.getKey());
            }
        }
        if(ls.size()==0){
            int res[]=new int[1];
            res[0]=-1;
            return res;
        }
        int res[]=new int[ls.size()];
        for(i=0;i<res.length;i++){
            res[i]=ls.get(i);
        }
        Arrays.sort(res);
        return res;
    }
}