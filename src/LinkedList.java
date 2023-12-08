public class LinkedList {

    public class Node
    {
        private int value;
        private Node next;

        public Node(int value)
        {
            this.value = value;
            this.next = null;
        }
        public void setNext(Node node)
        {
            next = node;
        }
        public Node getNext()
        {
            return next;
        }
    }

    private Node head;
    private Node tail;
    private Node current;
    private int size;

    public void addHead(int value)
    {
        Node node = new Node(value);
        node.setNext(head.getNext());
        head.setNext(null);
        head = node;
    }
    public void addTail(int value)
    {
        current = head;
        Node node = new Node(value);
        for (int i = 0; i < size - 1; i++)
        {
            current = current.getNext();
        }
        current.setNext(node);
        tail = node;
    }

    public void removeHead()
    {
        head = head.getNext();
    }

    public void newTail(int value)
    {
        current = head;
        Node node = new Node(value);
        for (int i = 0; i < size - 2; i++)
        {
            current = current.getNext();
        }
        current.setNext(null);
    }
}
