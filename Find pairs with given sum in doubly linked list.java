import java.util.*;
class Solution {
    public static class Node{
        int data;
        Node next;
        Node prev;
        Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }
    public static ArrayList<ArrayList<Integer>> findPairsWithGivenSum(int target, Node head) {
        ArrayList<ArrayList<Integer>>ls=new ArrayList<>();
        Node temp=head;
        Node temp1=head;
        int c=0;
        while(temp1.next!=null){
            c++;
            temp1=temp1.next;
        }
        int sum=0;
        int i=0;
        int j=c+1;
        while(i<j && temp!=temp1){
            sum=temp.data+temp1.data;
            if(sum==target){
               ArrayList<Integer>lp=new ArrayList<Integer>();
               lp.add(temp.data);
               lp.add(temp1.data);
               ls.add(lp);
            }
            if(sum>target){
                j--;
                temp1=temp1.prev;
            }
            else{
                i++;
                temp=temp.next;
            }
        }
        return ls;
    }
}