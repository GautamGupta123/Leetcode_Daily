class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data = data;
        next = null;
    }
}
class Solution
{
    static Node segregate(Node head)
    {
        int i;
        Node temp=head;
        int c=0;
        while(temp!=null){
            c++;
            temp=temp.next;
        }
        int ans[]=new int[c];
        temp=head;
        for(i=0;i<=ans.length-1;i++){
            ans[i]=temp.data;
            temp=temp.next;
        }
        Arrays.sort(ans);
        temp=head;
        for(i=0;i<=ans.length-1;i++){
            temp.data=ans[i];
            temp=temp.next;
        }
        return head;
    }
}