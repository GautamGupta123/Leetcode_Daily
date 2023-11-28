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
    public ListNode removeElements(ListNode head, int val) {
        ListNode temp1=head;
        int flg=0;
        int c=0;
        while(temp1!=null){
            c++;
            if(temp1.val==val){
                flg++;
            }
            temp1=temp1.next;
        }
        if(flg==c){
            head=null;
            return head;
        }
        if(head.next==null && head.val==val){
            head=null;
            return head;
        }
        ListNode temp=head;
            ListNode pre=null;
            
        while(temp!=null){
            if(head.val==val){
                head=head.next;
                temp=head;
            }
            temp=temp.next;
        }
        temp=head;
         while(temp.next!=null){
            pre=temp;
            temp=temp.next;
            if(temp.val==val){
                pre.next=temp.next;
                temp=null;
                temp=pre;
            }
        }
        return head;
   } 
}