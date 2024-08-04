public class LinkedList {
    Node head;
    int size;

    LinkedList() {
        size = 0;
    }

    public class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }

    public void addAtFirst(String data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void addAtEnd(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.print("null");
    }

    public void removeFirst() {
        if (head == null) {
            System.out.println("Empty List");
            return;
        }
        head = head.next;
        size--;
    }

    public void removeLast() {
        if (head == null) {
            System.out.println("Empty List");
            return;
        } else if (head.next == null) {
            head = null;
            return;
        }
        size--;
        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
    }

    public int Getsize() {
        return size;
    }

    public int length() {
        int count = 0;
        Node temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;

        }
        return count;
    }

    public void addAtPos(String data, int pos) {
        if (pos > size || pos < 0) {
            System.out.println("Invalid Index value");
            return;
        }
        else if (pos == 1 || head == null) {
            addAtFirst(data);
            return;
        }
        Node temp = head;
        Node newNode = new Node(data);
        for (int i = 1; i < pos - 1; i++) {
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public void deleteAtpos(int pos){
        if(head==null || head.next==null){
            head=null;
        }
        Node temp=head;
        for(int i=1;i<pos-1;i++){
            temp=temp.next;
        }
        temp.next=temp.next.next;
    }

    public boolean hasLoop(Node head){
        Node slow=head;
        Node fast=head;
        while (fast.next!=null && fast!=null) {
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow){
                return true;
            }
        }
        return false;
    }

    public int loopLength(Node head){
        Node slow=head;
        Node fast=head;
        while (fast.next!=null && fast!=null) {
            fast=fast.next.next;
            slow=slow.next;
            int count=1;
            if(fast==slow){
                while (fast!=slow) {
                    slow=slow.next;
                    count++;
                }
                return count;
            }
        }
        return 0;
    }

    public void addFromEnd(String data,int pos){
        Node newNode=new Node(data);
        Node fast=head;
        Node slow=head;
        for(int i=1;i<=pos;i++){
            fast=fast.next;
        }
        while (fast!=null) {
            fast=fast.next;
            slow=slow.next;
        }
        newNode.next=slow.next;
        slow.next=newNode;
    }
    public void removeFromEnd(int pos){
        Node slow=head;
        Node fast=head;
        for(int i=1;i<=pos;i++){
            fast=fast.next;
        }
        while (fast.next!=null) {
            fast=fast.next;
            slow=slow.next;
        }
        slow.next=slow.next.next;
    }
}

    class Linked_List{
        public static void main(String[] args) {
            LinkedList list = new LinkedList();
            list.addAtFirst("1");
            list.addAtEnd("2");
            list.addAtEnd("3");
            list.addAtEnd("4");
            list.addAtEnd("5");
            list.printList();
        }
    }

    


