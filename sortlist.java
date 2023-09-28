  class ListNode{
        int val;
        ListNode next;
        ListNode(int val){
            this.val=val;
            this.next=null;
        }
class Solution {
    }
    public ListNode sortList(ListNode head) {
        ListNode temp=head;
        ListNode prev=null;
        int data;
        while(temp!=null){
            prev=temp.next;
            while(prev!=null){
                if(temp.val>prev.val){
                    data=temp.val;
                    temp.val=prev.val;
                    prev.val=data;
                }
                prev=prev.next;
            }
            temp=temp.next;
        }
        return head;
    }
}