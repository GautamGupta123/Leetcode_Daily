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
    public ListNode insertionSortList(ListNode head) {
        ListNode c=head;
        ListNode index=null;
        int temp;
        while(c!=null){
            index=c.next;
            while(index!=null){
                if(c.val>index.val){
                    temp=c.val;
                    c.val=index.val;
                    index.val=temp;
                }
                index=index.next;
            }
            c=c.next;
        }
        return head;
    }
}