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
    public ListNode partition(ListNode head, int x) {
        ListNode temp=head;
        int c=0;
        while(temp!=null){
            c++;
            temp=temp.next;
        }
        int ans[]=new int[c];
        temp=head;
        int i=0;
        while(temp!=null){
            if(temp.val<x){
                ans[i]=temp.val;
                i++;
            }
            temp=temp.next;
        }
        temp=head;
        while(temp!=null){
            if(temp.val>=x){
                ans[i]=temp.val;
                i++;
            }
            temp=temp.next;
        }
        temp=head;
        for(i=0;i<=c-1;i++){
            temp.val=ans[i];
            temp=temp.next;
        }
        return head;
    }
}