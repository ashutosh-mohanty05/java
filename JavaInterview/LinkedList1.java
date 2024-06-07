class LinkedList1 {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public void deleteByKey(int key) {
        Node temp = head, prev = null;

        if (temp != null && temp.data == key) {
            head = temp.next;
            return;
        }

        while (temp != null && temp.data != key) {
            prev = temp;
            temp = temp.next;
        }

        if (temp == null) return;

        prev.next = temp.next;
    }

    public static void main(String[] args) {
        LinkedList1 list = new LinkedList1();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        System.out.println("Linked List:");
        list.printList();
        System.out.println("\nDeleting node with key 2");
        list.deleteByKey(2);
        System.out.println("Linked List after deletion:");
        list.printList();
    }
}

