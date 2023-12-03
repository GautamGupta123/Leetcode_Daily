import java.util.*;
class Solution {
    public List<Integer> findPeaks(int[] mountain) {
        ArrayList<Integer>ls=new ArrayList<Integer>();
        int i;
        for(i=1;i<mountain.length-1;i++){
            if(mountain[i]>mountain[i-1] && mountain[i]>mountain[i+1]){
                ls.add(i);
            }
        }
        return ls;
    }
}