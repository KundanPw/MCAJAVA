public class LinkedList{
    public static class Node{
        int data;
         Node next;
        public Node(int data) {
            this.data = data;
            this.next = null;
        }

    }

    public static Node head;
    public static Node tail;
    public static int size=0;

    public void print() {
        Node temp = head;

        while(temp != null) {
            System.out.print(temp.data+" -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;
        if(head == null) {
           head = tail = newNode;
           return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if(head == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        tail = newNode;
    }

    public void add(int idx, int data) {
        if(idx == 0) {
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i=0;
        while(i < idx-1) {
            temp = temp.next;
            i++;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    public int removeFirst() {
        if(size==0) {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        } else if(size==1) {
            int val = head.data;
            head = tail = null;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    public int removeLast() {
        if(size==0) {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        } else if(size==1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }

        // prev: i=size-2
        Node prev = head;
        for(int i=0; i<size-2; i++) {
            prev = prev.next;
        }

        int val = prev.next.data; // tail.data;
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }

    public int itrSearch(int key) { // Iterative search O(n)
        Node temp = head;
        int i=0;

        while(temp!=null) {
            if(temp.data == key) {   // key found
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;
    }

    public int helper(Node head, int key) {
        if(head == null) {
            return -1;
        }
        
        if(head.data==key) {
            return 0;
        }

        int idx = helper(head.next, key);
        if(idx == -1) {
            return -1;
        }
        return idx+1;
    }

    public int recSearch(int key) {
        return helper(head, key);
    }
   
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        
        // Node newNode = new Node(4);
        // System.out.println(newNode.data);

        ll.addFirst(2);
        ll.addFirst(3);
        ll.addLast(4);
        ll.add(2, 7); // it add nodes anywhere between start and end node
        ll.addLast(5);
       // ll.print();
       // ll.removeFirst(); // it removes first node
       // ll.removeLast(); // it reomves last node
       System.out.println(ll.itrSearch(4)); // 3
       System.out.println(ll.itrSearch(9)); // -1

       System.out.println(ll.recSearch(4)); // 3
       System.out.println(ll.recSearch(9)); // -1

        ll.print();
        System.out.println("size of nodes are  "+size);
    }
}