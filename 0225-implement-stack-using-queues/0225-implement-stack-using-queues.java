class MyStack {
    Queue<Integer> queue;
    Queue<Integer> stack;
    public MyStack() {
        queue = new LinkedList<>();
        stack = new LinkedList<>();
    }
    
    public void push(int x) { 
        queue.add(x); //  Added a new element to the queue
        while(!stack.isEmpty()){ // Move all elemets from the queue to create a stack
            queue.add(stack.remove());
        }
        while(!queue.isEmpty()){ // Now move all elements from stack to queue to maintain the order.
            stack.add(queue.remove());
        } 
    }
    
    public int pop() { // Remove the element from the top of stack.
        return stack.remove();
    }
    
    public int top() {
        return stack.peek(); // Retrun the first element from the stack.
    }
    
    public boolean empty() {
        return stack.isEmpty() && queue.isEmpty(); // Check if both queues are empty or not.
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */