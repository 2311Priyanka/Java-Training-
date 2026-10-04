public class Main {

    Node head;

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public void insertFirst(int n) {
        Node newNode = new Node(n);
        newNode.next = head;
        head = newNode;
    }
    public void insertLast(int n) {
        Node newNode = new Node(n);

        if (head == null) {
            head = newNode;
            return;
        }

        Node curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }

        curr.next = newNode;
    }
    public void deleteFirst() {
        if (head == null) {
            return;
        }

        head = head.next;
    }
    public void deleteLast() {
        if (head == null) {
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }

        Node curr = head;
        Node prev = null;

        while (curr.next != null) {
            prev = curr;
            curr = curr.next;
        }

        prev.next = null;
    }
 public void display() {
        Node curr = head;

        while (curr != null) {
            System.out.print(curr.data + " -> ");
            curr = curr.next;
        }

        System.out.println("null");
    }
    public void insertMiddle(int position, int data) {

    Node newNode = new Node(data);
    if (position == 1) {
        newNode.next = head;
        head = newNode;
        return;
    }

    Node curr = head;

    for (int i = 1; i < position - 1 && curr != null; i++) {
        curr = curr.next;
    }

    if (curr == null) {
        System.out.println("Invalid Position");
        return;
    }

    newNode.next = curr.next;
    curr.next = newNode;
}
public void deleteMiddle(int position) {

    if (head == null) {
        System.out.println("List is empty");
        return;
    }

    if (position == 1) {
        head = head.next;
        return;
    }

    Node curr = head;

    for (int i = 1; i < position - 1 && curr.next != null; i++) {
        curr = curr.next;
    }

    if (curr.next == null) {
        System.out.println("Invalid Position");
        return;
    }

    curr.next = curr.next.next;
}
    public static void main(String[] args) {
        Main ls = new Main();
        ls.insertFirst(1);
        ls.insertFirst(2);
        ls.insertLast(3);
        ls.display();
        ls.deleteLast();
        ls.display();
    }
}