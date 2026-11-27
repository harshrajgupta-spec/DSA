class LRUCache {
    class Node{
        int key;
        int val;
        Node prev;
        Node next;

        Node(int key, int val){
            this.key=key;
            this.val=val;
            this.prev=null;
            this.next=null;
        }
    }
    Map<Integer, Node> map=new HashMap<>();
    Node head=new Node(-1, -1);
    Node tail=new Node(-1, -1);
    int limit=0;
    public LRUCache(int capacity) {
        limit=capacity;
        head.next=tail;
        tail.prev=head;
    }
    public void add(Node newNode){
        Node oldNode=head.next;

        head.next=newNode;
        oldNode.prev=newNode;

        newNode.next=oldNode;
        newNode.prev=head;

    }

    public void delete(Node oldNode){
         Node oldPrev=oldNode.prev;
         Node oldNext=oldNode.next;
         
         oldPrev.next=oldNext;
         oldNext.prev=oldPrev;

    }
    
    public int get(int key) {
    if(map.containsKey(key)){
        Node node = map.get(key);

        delete(node);
        add(node);

        return node.val;
       }
        return -1;
     }
    
    public void put(int key, int value) {
         if(map.containsKey(key)){
            Node oldNode=map.get(key);
            map.remove(key);
            delete(oldNode);
         }
         if(map.size()>=limit){
            map.remove(tail.prev.key);
            delete(tail.prev);
         }

         Node newNode=new Node(key, value);
         add(newNode);
         map.put(key, newNode);

    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */