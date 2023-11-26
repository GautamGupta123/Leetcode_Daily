class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        int i,j;
        int n=heights.length;
        int temp=0;
        String temp1="";
        for(i=0;i<=n-1;i++){
            for(j=0;j<=n-2-i;j++){
                if(heights[j]<heights[j+1]){
                    temp1="";
                    temp=heights[j];
                    heights[j]=heights[j+1];
                    heights[j+1]=temp;
                    temp1=temp1+names[j];
                    names[j]=names[j+1];
                    names[j+1]=temp1;
                }
            }
        }
        return names;
    }
}