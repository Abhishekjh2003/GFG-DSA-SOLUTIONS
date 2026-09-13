class Solution {
    Node insertAtEnd(Node head, int x) {

        Node newNode = new Node(x);

        // If list is empty
        if (head == null) {
            return newNode;
        }

        Node current = head;

        // Go to the last node
        while (current.next != null) {
            current = current.next;
        }

        // Insert new node at the end
        current.next = newNode;

        return head;
    }
}