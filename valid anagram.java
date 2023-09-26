import java.util.*;
class Solution {
    public boolean isAnagram(String s, String t) {
        char arr[]=s.toCharArray();
        char arr1[]=t.toCharArray();
        int i;
        int flag=0;
        Arrays.sort(arr);
        Arrays.sort(arr1);
        if(arr.length<arr1.length || arr.length>arr1.length){
            return false;
        }
        else{
            for(i=0;i<=arr.length-1;i++){
                if(arr[i]==arr1[i]){
                    flag++;
                }
            }
        }
        if(flag==arr.length){
            return true;
        }
        return false;
    }
}