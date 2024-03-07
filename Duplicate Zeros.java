class Solution {
    public void duplicateZeros(int[] arr) {
        ArrayList<Integer>ls=new ArrayList<>();
        int i;
        int t=0;
        int n=arr.length;
        int cnt=0;
        for(i=0;i<arr.length-t;i++){
            if(arr[i]==0){
                ls.add(arr[i]);
                ls.add(0);
                 t++;
            }
            else{
                ls.add(arr[i]);
            }
        }
        ls.add(arr[arr.length-1]);
        int j=0;
        for(i=0;i<arr.length;i++){
            arr[i]=ls.get(i);
        }
    }
}