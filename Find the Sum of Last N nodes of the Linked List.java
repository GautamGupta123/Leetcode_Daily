import java.util.*;
class Solution {
    public class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public int sum(Node head, int k){
      Node temp=head;
      ArrayList<Integer>ls=new ArrayList<Integer>();
      int i;
      while(temp!=null){
          ls.add(temp.data);
          temp=temp.next;
      }
      int k1=ls.size()-k;
      int sum=0;
      for(i=k1;i<=ls.size()-1;i++){
          sum+=ls.get(i);
      }
      return sum;
    }
}