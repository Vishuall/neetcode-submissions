public class Node {
    int key;
    int val;
    Node prev;
    Node next;

    public Node(int key, int val) {
        this.key = key;
        this.val = val;
        this.prev = null;
        this.next = null;
    }
}

class LRUCache {
    // Doubly Linked List Node
    class Node {
        int key;
        int value;
        Node prev;
        Node next;

        Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    private int capacity;
// HashMap: key -> Node
    private HashMap<Integer, Node> map;

    // Dummy nodes
    private Node head;
    private Node tail;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        map = new HashMap<>();

        head = new Node(0, 0);
        tail = new Node(0, 0);

        head.next = tail;
        tail.prev = head;
    }
    // Remove a node from the linked list
    private void remove(Node node) {
        Node prevNode = node.prev;
        Node nextNode = node.next;

        prevNode.next = nextNode;
        nextNode.prev = prevNode;
    }

    // Add node just before tail = Most Recently Used
    private void insert(Node node) {
        Node prevNode = tail.prev;

        prevNode.next = node;
        node.prev = prevNode;

        node.next = tail;
        tail.prev = node;
    }

    public int get(int key) {
        // Key doesn't exist
        if (!map.containsKey(key)) {
            return -1;
        }

        Node node = map.get(key);

        // We just used it, so move it to MRU
        remove(node);
        insert(node);

        return node.value;
    }

    
    public void put(int key, int value) {
       // Key already exists
        if (map.containsKey(key)) {

            Node node = map.get(key);

            node.value = value;

            // Move to MRU
            remove(node);
            insert(node);

            return;
        }

        // Create new node
        Node newNode = new Node(key, value);

        map.put(key, newNode);
        insert(newNode);

        // Capacity exceeded
        if (map.size() > capacity) {

            // LRU is head.next
            Node lru = head.next;

            remove(lru);
            map.remove(lru.key);
        } 
    }
}
