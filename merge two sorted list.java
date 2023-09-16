class Solution {
    public static class ListNode{
        int val;
        ListNode next=null;
        ListNode(int val){
            this.val=val;
            this.next=null;
        }
    }
    public ListNode mergeTwoLists(ListNode head1, ListNode head2) {
       ListNode temp=head1;
       if(head1!=null && head2!=null){
       while(temp.next!=null){
           temp=temp.next;
       }
       temp.next=head2;
           ListNode cur=head1;
           int data;
           ListNode prev=null;
           while(cur!=null){
               prev=cur.next;
               while(prev!=null){
                   if(cur.val>prev.val)
                   {
                       data=cur.val;
                       cur.val=prev.val;
                       prev.val=data;
                   }
                   prev=prev.next;
               }
               cur=cur.next;
           }
           return head1;
        }
        else if(head1==null && head2==null){
            return head1;
        }
        else if(head1!=null && head2==null){
            if(head1.next==null){
                return head1;
            }
            ListNode cur=head1;
           int data;
           ListNode prev=null;
           while(cur!=null){
               prev=cur.next;
               while(prev!=null){
                   if(cur.val>prev.val)
                   {
                       data=cur.val;
                       cur.val=prev.val;
                       prev.val=data;
                   }
                   prev=prev.next;
               }
               cur=cur.next;
           }
           return head1;
        }
        else if(head1==null && head2!=null){
            if(head2.next==null){
                return head2;
            }
           ListNode cur=head2;
           int data;
           ListNode prev=null;
           while(cur!=null){
               prev=cur.next;
               while(prev!=null){
                   if(cur.val>prev.val)
                   {
                       data=cur.val;
                       cur.val=prev.val;
                       prev.val=data;
                   }
                   prev=prev.next;
               }
               cur=cur.next;
           }
           return head2;
        }
        return head1;
    }
}