class Solution {
    public Node findIntersection(Node head1, Node head2) {
        Node dummy = new Node(0);
        Node tail = dummy;

        java.util.HashSet<Integer> set = new java.util.HashSet<>();

        Node current = head2;
        while (current != null) {
            set.add(current.data);
            current = current.next;
        }

        current = head1;

        while (current != null) {
            if (set.contains(current.data)) {
                tail.next = new Node(current.data);
                tail = tail.next;
            }
            current = current.next;
        }

        return dummy.next;
    }
}