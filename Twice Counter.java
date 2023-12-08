class Solution
{
    public int countWords(String list[], int n)
    {
        HashMap<String,Integer>hm=new HashMap<String,Integer>();
        int i;
        int c=0;
        for(i=0;i<=list.length-1;i++){
            hm.put(list[i],hm.getOrDefault(list[i],0)+1);
        }
        for(Map.Entry m: hm.entrySet()){
            if(m.getValue().equals(2)){
                c++;
            }
        }
        return c;
    }
}