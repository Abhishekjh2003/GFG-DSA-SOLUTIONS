class Solution {
    Node reverseBetween(int a, int b, Node head) {
        if (head == null || a == b) {
            return head;
        }

        Node dummy = new Node(0);
        dummy.next = head;

        Node prev = dummy;

        // Move to node before position a
        for (int i = 1; i < a; i++) {
            prev = prev.next;
        }

        Node curr = prev.next;

        // Reverse from a to b
        for (int i = 0; i < b - a; i++) {
            Node next = curr.next;

            curr.next = next.next;
            next.next = prev.next;
            prev.next = next;
        }

        return dummy.next;
    }
}