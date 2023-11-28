class Solution {
    public static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
    
        ListNode temp=list1;
        ListNode h=list2;
        while(h.next!=null){
            h=h.next;
        }
        int i=a;
        while(temp!=null && i>1){
            temp=temp.next;
            i--;
        }
        ListNode temp1=list1;
        int j=b;
       while(temp1!=null && j>0){
            temp1=temp1.next;
           j--;
        }
        temp.next=list2;
        h.next=temp1.next;
        return list1;
    }
}