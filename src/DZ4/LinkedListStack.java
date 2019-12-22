package DZ4;

public class LinkedListStack<T> {

    private Node head;

    private static class Node {
        int value;
        Node next;
    }

    public LinkedListStack() {
        head = null;
    }

    public int pop() throws LinkedListEmptyException {
        if (head == null) {
            throw new LinkedListEmptyException();
        }
        int value = head.value;
        head = head.next;
        return value;
    }

    public void push(int value) {
        Node oldHead = head;
        head = new Node();
        head.value = value;
        head.next = oldHead;
    }

    public static void main(String args[])
    {
        LinkedListStack lls=new LinkedListStack();
        lls.push(100);
        lls.push(54);
        lls.push(85);
        System.out.println("Элемент удален из листа : "+lls.pop());
        System.out.println("Элемент удален из листа: "+lls.pop());
        lls.push(10);
        System.out.println("Элемент удален из листа: "+lls.pop());
        printList(lls.head);
    }
    public static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.format("%d ", temp.value);
            temp = temp.next;
        }
        System.out.println();
    }
}

/**
 *
 * Exception to indicate that LinkedList is empty.
 */

class LinkedListEmptyException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public LinkedListEmptyException() {
        super();
    }

    public LinkedListEmptyException(String message) {
        super(message);
    }
}
