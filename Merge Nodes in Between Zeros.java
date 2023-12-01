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
    public ListNode mergeNodes(ListNode head) {
        ListNode temp=head.next;
        int sum=0;
        ListNode temp2=null;
        ListNode temp1=head;
        while(temp!=null){
            sum+=temp.val;
            if(temp.val==0){
                temp1.val=sum;
                temp2=temp1;
                temp1=temp1.next;
                sum=0;
            }
            temp=temp.next;
        }
        temp1=null;
        temp2.next=null;
        return head;
    }
}