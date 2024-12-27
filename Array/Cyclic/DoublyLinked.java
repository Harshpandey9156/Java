package Array.Cyclic;

public class DoublyLinked {

    // Node class for doubly linked list with a child pointer
    static class Node {
        int val;
        Node next;
        Node prev;
        Node child;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.prev = null;
            this.child = null;
        }
    }

    
    public Node flatten(Node head) {
        if (head == null) {
            return head;
        }
        
        
        Node dummy = new Node(0);
        dummy.next = head;
        head.prev = dummy;

        
        flattenDFS(dummy, head);

        
        dummy.next.prev = null;
        return dummy.next;
    }

   
    private Node flattenDFS(Node prev, Node curr) {
        if (curr == null) return prev;

        // Connect the current node with the previous node
        curr.prev = prev;
        prev.next = curr;

        // Save the next node for later
        Node tempNext = curr.next;

         
        Node tail = (curr.child != null) ? flattenDFS(curr, curr.child) : curr;
        
        curr.child = null;

       
        return flattenDFS(tail, tempNext);
    }

    // Main method to test the flattening
    public static void main(String[] args) {
        DoublyLinked dl = new DoublyLinked();
        
        
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.prev = head;
        head.next.child = new Node(3);
        head.next.child.next = new Node(4);
        head.next.child.next.prev = head.next.child;

        Node flattenedHead = dl.flatten(head);

        // Print the  list to verify
        Node temp = flattenedHead;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
    }
}
