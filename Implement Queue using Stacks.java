class MyQueue {
     Queue<Integer>que=new LinkedList<Integer>();
    public MyQueue() {
        Queue<Integer>que=new LinkedList<Integer>();
    }
    
    public void push(int x) {
        que.add(x);
    }
    
    public int pop() {
       return que.remove();
    }
    
    public int peek() {
        int p=que.peek();
        return p;
    }
    
    public boolean empty() {
        if(que.size()==0){
            return true;
        }
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