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
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null || head.next==null) return head;
        HashMap<Integer,Integer>hm=new HashMap<>();
        int i;
        ListNode temp=head;
        while(temp!=null){
            hm.put(temp.val,hm.getOrDefault(temp.val,0)+1);
            temp=temp.next;
        }
        temp=head;
        int cnt=0;
        for(Map.Entry m1:hm.entrySet()){
            if((int)m1.getValue()==1){
                cnt++;
            }
        }
        if(cnt==0) return null;
        for(Map.Entry m1:hm.entrySet()){
          if((int)m1.getValue()==1){
                temp.val=(int)m1.getKey();
                temp=temp.next;
              }
            }
       ListNode temp1=head;
       while(temp1.next!=temp){
           temp1=temp1.next;
       }
      temp1.next=null;
        ListNode t=head;
        ListNode index=null;
        int t1;
        while(t!=null){
            index=t.next;
            while(index!=null){
                if(t.val>index.val){
                    t1=t.val;
                    t.val=index.val;
                    index.val=t1;
                }
                index=index.next;
            }
            t=t.next;
        }
      return head;
    }
}