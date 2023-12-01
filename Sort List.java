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
    public ListNode sortList(ListNode head) {
        int i;
        ListNode temp=head;
        int c=0;
        while(temp!=null){
            c++;
            temp=temp.next;
        }
        int ans[]=new int[c];
        temp=head;
        for(i=0;i<=ans.length-1;i++){
            ans[i]=temp.val;
            temp=temp.next;
        }
        Arrays.sort(ans);
        temp=head;
        for(i=0;i<=ans.length-1;i++){
            temp.val=ans[i];
            temp=temp.next;
        }
        return head;
    }
}