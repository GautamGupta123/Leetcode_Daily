class Solution
{
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    int getMiddle(Node head)
    {
         // Your code here.
        Node p,q;
        int n=0;
        q=head;
        p=head;
        while(q!=null){
            n++;
            q=q.next;
        }
        if(n%2!=0){
            int rem=(n+1)/2;
            while(rem!=1){
                p=p.next;
                rem--;
            }
            return p.data;
        }
        else if(n%2==0){
            int rem= (n/2)+1;
            while(rem!=1){
                p=p.next;
                rem--;
            }
            return p.data;
        }
        return p.data;
    }
}