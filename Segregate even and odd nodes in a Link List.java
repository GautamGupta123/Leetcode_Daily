class Node{
    int data;
    Node next;
    
    Node(int x){
        data = x;
        next = null;
    }
}
class Solution{
    Node divide(int N, Node head){
        int ans[]=new int[N];
        int i,j;
        j=0;
        Node temp=head;
        while(temp!=null){
            if((temp.data)%2==0){
                ans[j]=temp.data;
                j++;
            }
            temp=temp.next;
        }
       Node temp1=head;
         while(temp1!=null){
            if((temp1.data)%2!=0){
                ans[j]=temp1.data;
                j++;
            }
            temp1=temp1.next;
        }
        temp=head;
        i=0;
        while(temp!=null && i<=N-1){
            temp.data=ans[i];
            temp=temp.next;
            i++;
        }
        return head;
    }
}