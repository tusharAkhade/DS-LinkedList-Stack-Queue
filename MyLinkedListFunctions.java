public class MyLinkedListFunctions<T> {
    Node head;

    // 'head()' will return data in head
    public T head() {
        return (T) head.data;
    }

    // 'insert()' will add/insert node at First position
    public void insert(T data) {
        Node node = new Node();
        node.data = data;
        node.next = null;
        node.next = head;
        head = node;
    }

    // 'append()' will append node at last
    public void append(T data) {
        Node node = new Node();
        node.data = data;
        node.next = null;
        if (head == null) {
            head = node;
        } else {
            Node n = head;
            while (n.next != null) {
                n = n.next;
            }
            n.next = node;
        }
    }

    // 'insertAt()' will insert node at specific position/index
    public void insertAt(int position ,T data) {
        Node node = new Node();
        node.data = data;
        node.next = null;
        if (head == null && position == 0) {
            head = node;
        } else {
            Node n = head;
            int i = 0;
            while (i < position-1) {
                n = n.next;
                i++;
            }
            node.next = n.next;
            n.next = node;
        }
    }

    // 'popFirst()' will remove/pop first node
    public void popFirst() {
        if (head == null) {
            System.out.println("Empty");
        } else if (head.next == null) {
            head = null;
        } else {
            Node n = head;
            head = head.next;
            n.next = null;
        }
    }

    // 'popLast()' will remove/pop last node
    public void popLast() {
        if (head == null) {
            System.out.println("Empty");
        } else if (head.next == null) {
            head = null;
        } else {
            Node n = head;
            Node n1 = head;
            while (n.next != null) {
                n1 = n;
                n = n.next;
            }
            n1.next = null;
        }
    }

    // 'search()' will search the position of node
    public boolean search(T data) {
        boolean flag = false;
        Node n = head;
        while (n.next != null) {
            if (n.data == data) {
                return true;
            }
            n = n.next;
        }
        if (n.data == data) {
            return true;
        }
        return false;
    }

    // 'findPosition()' will return position of the node
    public int findPosition(T data) {
        int position = 0;
        Node n = head;
        while (n.next != null) {
            if (n.data == data) {
                return position;
            }
            position++;
            n = n.next;
        }
        if (n.data == data) {
            return position;
        }
        return -1;
    }

    // 'insertAfter()' will insert data after specific node value
    public void insertAfter(T after, T data) {
        Node node = new Node();
        node.data = data;
        node.next = null;
        boolean search = search(after);
        if (search == true) {
            Node n = head;
            while (n.next != null) {
                if (n.data == after) {
                    break;
                }
                n = n.next;
            }
            node.next = n.next;
            n.next = node;
        } else {
            System.out.println("Not found");
        }
    }

    // 'deleteByPosition()' will delete specific node from linked-list and it takes position/index as parameter
    public void deleteByPosition(int position) {
        int size = size();
        if (size > 0) {
            if (position == 0) {
                popFirst();
            } else {
                Node n = head;
                Node n1 = head;
                int i = 0;
                while (i < position) {
                    n1 = n;
                    n = n.next;
                    i++;
                }
                n1.next = n.next;
                n.next = null;
            }
        }
    }

    // 'deleteByValue()' will delete specific node from linked-list and it takes value/data as parameter
    public void deleteByValue(T data) {
        int position = findPosition(data);
        deleteByPosition(position);
    }

    // 'size()' will return the size of the linked-list
    public int size() {
        int size = 0;
        if (head == null) {
            return size;
        }
        Node n = head;
        while (n != null) {
            n = n.next;
            size++;
        }
        return size;
    }

    // 'show()' will show/print the list
    public void show() {
        if (head == null) {
            System.out.println("Empty");
        } else {
            Node n = head;
            while (n != null) {
                System.out.println(n.data);
                n = n.next;
            }
        }
    }
}
