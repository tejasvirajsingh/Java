class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class linkedList {
    Node head;

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

    public void delete(int key) {
        if (head == null) return;
        
        if (head.data == key) {
            System.out.println("Deleted node: " + head.data);
            head = head.next;
            return;
        }
        
        Node temp = head;
        while (temp.next != null && temp.next.data != key) {
            temp = temp.next;
        }
        
        if (temp.next != null) {
            System.out.println("Deleted node: " + temp.next.data);
            temp.next = temp.next.next;
        } else {
            System.out.println("Node not found: " + key);
        }
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        linkedList list = new linkedList();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);
        list.insert(50);
        list.insert(60);
        list.display(); 

        list.delete(20);
        list.display(); 
        System.out.println("Finally Done The Work of MR Max.");
    }
}
