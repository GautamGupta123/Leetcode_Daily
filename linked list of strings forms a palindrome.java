class GfG
{
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static boolean compute(Node node)
    {
        StringBuilder s=new StringBuilder();
        Node temp=node;
        while(temp!=null){
            s.append(temp.data);
            temp=temp.next;
        }
        String str=s.toString();
        int i=0;
        int n=str.length();
        int j=n-1;
        int flag=0;
        while(i<j){
            if(str.charAt(i)==str.charAt(j)){
                flag++;
                i++;
                j--;
            }
            else{
                return false;
            }
        }
        if(flag==(n/2)){
            return true;
        }
        return false;
    }
}