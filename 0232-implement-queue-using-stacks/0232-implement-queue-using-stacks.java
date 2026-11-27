class MyQueue {
    Stack<Integer> st1=new Stack<>();
    Stack<Integer> st2=new Stack<>();
    public MyQueue() {
        
    }
    
    public void push(int x) {
        st1.push(x);
    }
    
    public int pop() {
        int size=st1.size();
        for(int i=0; i<size-1; i++){
            st2.push(st1.pop());
        }
        int front=st1.pop();
        while(!st2.isEmpty()){
            st1.push(st2.pop());
        }
        return front;
    }
    
    public int peek() {
        while(!st1.isEmpty()){
            st2.push(st1.pop());
        }
        int front=st2.peek();
        while(!st2.isEmpty()){
            st1.push(st2.pop());
        }
        return front;
        
    }
    
    public boolean empty() {
        if(st1.isEmpty())return true;
        return false;
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */