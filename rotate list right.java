class Solution {
    public static class ListNode{
        int data;
        ListNode next;
        ListNode(int data){
            this.data=data;
            this.next=null;
        }
    }
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null){
            return head;
        }
        int ans=0;
        int c=0;
        ListNode t=head;
        while(t!=null){
            c++;
            t=t.next;
        }
        ans=k%c;
        ListNode temp=head;
        ListNode p=null;
        while(ans>0){
            while(temp.next!=null){
                p=temp;
                temp=temp.next;
            }
            temp.next=head;
            p.next=null;
            head=temp;
            ans--;
        }
        return head;
    }
}