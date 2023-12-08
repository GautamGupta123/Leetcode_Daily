class Geeks
{
    public static void SortedDuplicates(int arr[], int n)
    {
        HashMap<Integer,Integer>hm=new HashMap<Integer,Integer>();
        ArrayList<Integer>ls=new ArrayList<Integer>();
        int i;
        for(i=0;i<=n-1;i++){
            hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);
        }
        int t=0;
        for(Map.Entry m:hm.entrySet()){
            if(!m.getValue().equals(1)){
                t++;
                ls.add((int)m.getKey());
            }
        }
        int arr1[]=new int[ls.size()];
        if(t==0){
            System.out.print(-1);
        }
        Collections.sort(ls);
        for(i=0;i<=ls.size()-1;i++){
                arr1[i]=ls.get(i);
            }
         for(i=0;i<=ls.size()-1;i++){
                System.out.print(arr1[i]+" ");
            }
     }
    
}
   