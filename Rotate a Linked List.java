class Solution {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public Node rotate(Node head, int k) {
        Node temp = head;
        if (head == null || head.next == null) {
            return head;
        }
        while (temp.next != null) {
            temp = temp.next;
        }
        Node temp1;
        while (k != 0) {
            temp1 = head;
            temp.next = temp1;
            head = head.next;
            temp1.next = null;
            temp = temp1;
            k--;
        }
        return head;
    }
}