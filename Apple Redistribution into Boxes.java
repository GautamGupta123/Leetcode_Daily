class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        int i;
        int sum=0;
        Arrays.sort(capacity);
        for(i=0;i<apple.length;i++){
            sum+=apple[i];
        }
        int boxsm=0;
        int minbox=0;
        for(i=capacity.length-1;i>=0;i--){
            boxsm+=capacity[i];
            minbox++;
            if(boxsm>=sum){
                return minbox;
            }
        }
        return minbox;
    }
}