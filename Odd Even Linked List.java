/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode oddEvenList(ListNode head) {
         int i=1;
          ListNode temp=head;
          int c=0;
          while(temp!=null){
              c++;
              temp=temp.next;
          }
          int ans[]=new int[c];
          temp=head;
          int j=0;
          while(temp!=null && i<=c){
              if(i%2!=0){
                  ans[j]=temp.val;
                  j++;
              }
              i++;
              temp=temp.next;
          }
          temp=head;
          i=1;
           while(temp!=null && i<=c){
              if(i%2==0){
                  ans[j]=temp.val;
                  j++;
              }
              i++;
              temp=temp.next;
          }
          temp=head;
          i=0;
          while(temp!=null){
              temp.val=ans[i];
              temp=temp.next;
              i++;
          }
        return head;
    }
}