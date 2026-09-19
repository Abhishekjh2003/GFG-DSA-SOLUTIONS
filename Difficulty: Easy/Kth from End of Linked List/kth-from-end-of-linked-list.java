class Solution {
    int getKthFromLast(Node head, int k) {
        Node fast = head;
        Node slow = head;

        // Move fast k nodes ahead
        for (int i = 0; i < k; i++) {
            if (fast == null) {
                return -1;
            }
            fast = fast.next;
        }

        // Move both pointers
        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }

        return slow.data;
    }
}