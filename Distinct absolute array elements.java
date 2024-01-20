class Solution {
    int distinctCount(int[] arr, int n) {
        ArrayList<Integer>ls=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(arr[i]<0){
                ls.add((-1)*arr[i]);
            }
            else ls.add(arr[i]);
        }
        HashMap<Integer,Integer>hm=new HashMap<>();
        for(int i=0;i<ls.size();i++){
            hm.put(ls.get(i),hm.getOrDefault(ls.get(i),0)+1);
        }
        return hm.size();
    }
}