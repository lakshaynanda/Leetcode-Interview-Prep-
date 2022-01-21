class MyLinkedList {
    class Node {
        int val;
        Node next;
        Node(int val) {
            this.val = val;
            this.next = null;
        }
    }
    Node head;
    Node tail;
    int size;
    
    public MyLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }
    
    
    public int get(int index) {
        if (index >= size) {
            return -1;
        }
        if (index == 0) {
            return head.val;
        }
        int i = 0;
        Node ptr = head;
        while (i++ < index - 1) {
            ptr = ptr.next;
        }
        return ptr.next.val;
    }
    
    public void addAtHead(int val) {
        Node node = new Node(val);
        if (head == null) {
            head = node;
            tail = node;
            size++;
            return;
        }
        node.next = head;
        head = node;
        size++;        
    }
    
    
    public void addAtTail(int val) {
        if (head == null) {
            addAtHead(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
        
    }
    
    public void addAtIndex(int index, int val) {
        if (index > size) {
            return;
        }
        if (index == 0) {
            addAtHead(val);
            return;
        }
        if (index == size) {
            addAtTail(val);
            return;
        }
        Node node = new Node(val);
        int i = 0;
        Node ptr = head;
        while (i++ < index - 1) {
            ptr = ptr.next;
        }
        node.next = ptr.next;
        ptr.next = node;
        size++;
    }
    
    public void deleteAtIndex(int index) {
        if (index >= size) {
            return;
        }
        if (index == 0) {
            head = head.next;
            size--;
            return;
        }
        int i = 0;
        Node ptr = head;
        while (i++ < index - 1) {
            ptr = ptr.next;
        }
        ptr.next = ptr.next.next;
        if (index == size - 1) {
            tail = ptr;
        }
        size--;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */