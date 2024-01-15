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
    public ListNode swapPairs(ListNode head) {
        if(head==null || head.next==null) return head;
        
        ListNode temp=head;
        int t;
        int cnt=0;
        while(temp!=null){
            cnt++;
            temp=temp.next;
        }
        if(cnt%2!=0){
            temp=head;
            while(temp.next.next.next!=null){
            t=temp.val;
            temp.val=temp.next.val;
            temp.next.val=t;
            temp=temp.next.next;
          }
            t=temp.val;
            temp.val=temp.next.val;
            temp.next.val=t;
        }
        else{
            temp=head;
        while(temp.next.next!=null){
            t=temp.val;
            temp.val=temp.next.val;
            temp.next.val=t;
            temp=temp.next.next;
        }
            t=temp.val;
            temp.val=temp.next.val;
            temp.next.val=t;
        }
        return head;
    }
}