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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode temp=head;
        int c=0;
        while(temp!=null){
            c++;
            temp=temp.next;
        }
        int i;
        int arr[]=new int[c];
        temp=head;
        for(i=0;i<=c-1;i++)
        {
            arr[i]=(temp.val);
            temp=temp.next;
        }
        int t=0;
        int p=0;
        int ind=0;
        int ind1=0;
        for(i=0;i<=arr.length-1;i++){
            if(t==left-1){
                ind=t;
            }
            if(p==right-1){
                ind1=p;
            }
            t++;
            p++;
        }
        int temp1;
        while(ind<=ind1){
            temp1=arr[ind];
            arr[ind]=arr[ind1];
            arr[ind1]=temp1;
            ind++;
            ind1--;
        }
        temp=head;
        for(i=0;i<=c-1;i++){
            temp.val=arr[i];
            temp=temp.next;
        }
        return head;
    }
}