class LL {
    Node head;
    int size;

    LL() {
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

    public void addFirst(String data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void addLast(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        Node lastNode = head;
        while (lastNode.next != null) {
            lastNode = lastNode.next;

        }
        lastNode.next = newNode;

    }

    public void printList() {
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("null");
    }

    public void removeFirst() {
        if (head == null) {
            System.out.println("Empty List, nothing to delete");
            return;
        }
        head = head.next;
        size--;

    }

    public void removeLast() {
        if (head == null) {
            System.out.println("Empty List, nothing to delete");
            return;

        }
        size--;
        if (head.next == null) {
            head = null;
            return;

        }
        Node currNode = head;
        Node lastNode = head.next;
        while (lastNode.next != null) {
            currNode = currNode.next;
            lastNode = lastNode.next;
        }
        currNode.next = null;

    }

    public int getSize() {
        return size;
    }
    
    public int length() {
        int c = 0;
        Node currnode = head;
        while (currnode != null) {
            c++;
            currnode = currnode.next;
        }
        return c;
    }

    public void addInMiddle(int index, String data) {
        if (index > size || index < 0) {
            System.out.println("Invalid Index value");
            return;

        }

        Node newNode = new Node(data);
        if (head == null || index == 0) {
            newNode.next = head;
            head = newNode;
            return;
        }
        Node currNode = head;
        for (int i = 1; i <= size; i++) {
            if (i == index) {
                Node nextNode = currNode.next;
                currNode.next = newNode; // newNode.next=currNode.next
                newNode.next = nextNode; // curr.next=newNode
                break;
            }
            currNode = currNode.next;
        }
    }

    

    public void reverseList() {
        if (head == null || head.next == null) { 
            return;
        }
        Node prevNode = head;
        Node currNode = head.next;
        while (currNode != null) {
            Node nextNode = currNode.next;
            currNode.next = prevNode;
            prevNode = currNode;
            currNode = nextNode;
        }
        head.next = null;
        head = prevNode;
    }

    public static Node reverseListRecursive(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node newHead = reverseListRecursive(head.next);

        head.next.next = head;
        head.next = null;
        return newHead;
    }

    public Node removeNthFromEnd(Node head, int n) {
        Node start = new Node("");
        start.next = head;
        Node fast = start;
        Node slow = start;

        for (int i = 1; i <= n; ++i)
            fast = fast.next;

        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }

        slow.next = slow.next.next;

        return start.next;
    }

    public Node getMiddle(Node head) {
        Node fast = head;
        Node slow = head;
        while (fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    public boolean isPalindrome(Node head) {
        if (head == null || head.next == null) {
            return true;
        }
        Node firstHalfEnd = getMiddle(head);
        Node secondHalfStart = reverseListRecursive(firstHalfEnd.next);
        Node firstHalfStart = head;
        while (secondHalfStart != null) {
            if (secondHalfStart.data != firstHalfStart.data) {
                return false;
            }
            secondHalfStart = secondHalfStart.next;
            firstHalfStart = firstHalfStart.next;

        }
        return true;

    }

    public boolean hasLoop(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                return true;
            }

        }
        return false;
    }

    public void createLoop() {
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = head;
    }

    public void reverseLL() {
        Node prev = head;
        Node curr = head.next;
        while (curr != null) {
            Node nextN = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextN;
        }
        head.next = null;
        head = prev;
    }

    public Node reverseRec(Node head) {
        if (head.next == null) {
            return head;
        }
        Node newNode = reverseRec(head.next);
        head.next.next = head;
        head.next = null;
        return newNode;
    }

}

class Main {

    public static void main(String args[]) {
        // LL list1 = new LL();
        // LL list2 = new LL();
        /*
         * list.addLast("is");
         * list.addLast("a");
         * list.addLast("list");
         * list.printList();
         * list.addFirst("this");
         * list.printList();
         * System.out.println(list.getSize());
         * list.removeFirst();
         * list.printList();
         * list.removeLast();
         * list.printList();
         * list.addInMiddle(2,"list");
         * list.printList();
         * list.addInMiddle(0,"this");
         * list.printList();
         * System.out.println(list.length());
         * list.head=list.reverseListRecursive(list.head);
         * list.printList();
         * list.reverseList();
         * list.printList();
         * list.head=list.removeNthFromEnd(list.head,2);
         * list.printList();
         */
        // list1.addFirst("1");
        // list2.addLast("2");
        // list1.addLast("3");
        // list2.addLast("4");
        // list1.addLast("5");
        // list2.addLast("6");
        // list1.addLast("7");
        // list2.addLast("8");
        // list1.addLast("9");
        // list1.printList();
        // list2.printList();
        // list.createLoop();
        // System.out.println(list.hasLoop(list.head));
        // System.out.println(list.isPalindrome(list.head));
        // list.reverseLL();
        // list.printList();
        // list.head=list.reverseRec(list.head);
        // list.printList();
    }
}
