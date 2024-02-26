class Solution {
    public boolean isCovered(int[][] ranges, int left, int right) {
        HashSet<Integer>hs=new HashSet<>();
        int n=ranges.length;
        int m=ranges[0].length;
        int i,j;
        for(j=0;j<n;j++){
          for(i=ranges[j][0];i<=ranges[j][1];i++){
              hs.add(i);
          }
        }
        HashSet<Integer>hs1=new HashSet<>();
        for(i=left;i<=right;i++){
            hs1.add(i);
        }
        int t=0;
        ArrayList<Integer>ls=new ArrayList<>(hs1);
        for(i=0;i<ls.size();i++){
            if(hs.contains(ls.get(i))){
                t++;
            }
        }
        if(t==ls.size()) return true;
        return false;
    }
}