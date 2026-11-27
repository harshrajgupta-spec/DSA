class MinStack {
    class Node{
        int min;
        int val;
        Node next;
        Node(int min, int val, Node next){
            this.min=min;
            this.val=val;
            this.next=next;
        }
    }
    public MinStack() {
        
    }
    private Node head=null;
    public void push(int value) {
        if(head==null){
            head=new Node(value, value, null);
        }
        else{
            head=new Node(Math.min(head.min, value), value, head);
        }
    }
    
    public void pop() {
        head=head.next;
    }
    
    public int top() {
        return head.val;
    }
    
    public int getMin() {
        return head.min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */