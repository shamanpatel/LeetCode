class MyQueue {
    Stack<Integer> stack; // To store initial data
    Stack<Integer> queue; // Used for reversing stack to act as queue
    
    public MyQueue() {
        stack = new Stack<>(); // Initialize the stack
        queue = new Stack<>(); // Initialize the queue
    }
    
    public void push(int x) {
        stack.push(x); // Push element into the stack
    }
    
    public int pop() {
        if (!empty()) { // Check if the queue is not empty
            while (!stack.isEmpty()) { 
                queue.push(stack.pop()); // Move all elements from stack to queue
            }
            int value = queue.pop(); // Pop the front element of the queue (FIFO)
            while (!queue.isEmpty()) { 
                stack.push(queue.pop()); // Restore the elements back to the stack
            }
            return value; // Return the popped element
        }
        return 0; // Return 0 if queue is empty
    }
    
    public int peek() {
        if (!empty()) { // Check if the queue is not empty
            while (!stack.isEmpty()) {
                queue.push(stack.pop()); // Move all elements from stack to queue
            }
            int value = queue.peek(); // Peek the front element without removing it
            while (!queue.isEmpty()) {
                stack.push(queue.pop()); // Restore the elements back to the stack
            }
            return value; // Return the peeked element
        }
        return 0; // Return 0 if queue is empty
    }
    
    public boolean empty() {
        return stack.isEmpty(); // Return true if stack is empty, else false
    }
}

/**
 * Usage Example:
 * MyQueue obj = new MyQueue(); // Create a new queue
 * obj.push(1); // Push 1 to the queue
 * obj.push(2); // Push 2 to the queue
 * int param_2 = obj.pop(); // Pop the front element, param_2 = 1
 * int param_3 = obj.peek(); // Peek the front element, param_3 = 2
 * boolean param_4 = obj.empty(); // Check if queue is empty, param_4 = false
 */
