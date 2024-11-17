class MyCircularDeque {
    int[] q;          // Array to hold deque elements
    int front = 0, rear = 0, size = 0;      
    int capacity;     // Maximum capacity of deque

    public MyCircularDeque(int k) {
        q = new int[k];         // Initialize array with size k
        capacity = k;           // Store maximum capacity
    }

    public boolean insertFront(int value) {
        if (isFull()) {         // Check if deque is full
            return false;     
        }
        front = (front - 1 + capacity) % capacity; // Move front backward circularly
        q[front] = value;       // Insert value at the front
        size++;                 // Increment size
        return true;      
    }

    public boolean insertLast(int value) {
        if (isFull()) {         // Check if deque is full
            return false;     
        }
        q[rear] = value;        // Insert value at the rear
        rear = (rear + 1) % capacity; // Move rear forward circularly
        size++;                 // Increment size
        return true;          
    }

    public boolean deleteFront() {
        if (isEmpty()) {        // Check if deque is empty
            return false;       
        }
        front = (front + 1) % capacity; // Move front forward circularly
        size--;                 // Decrement size
        return true;            
    }

    public boolean deleteLast() {
        if (isEmpty()) {        // Check if deque is empty
            return false;      
        }
        rear = (rear - 1 + capacity) % capacity; // Move rear backward circularly
        size--;                 // Decrement size
        return true;           
    }

    public int getFront() {
        if (isEmpty()) {        // Check if deque is empty
            return -1;
        }
        return q[front];        // Return the front element
    }

    public int getRear() {
        if (isEmpty()) {        // Check if deque is empty
            return -1;       
        }
        int rearIndex = (rear - 1 + capacity) % capacity; // Calculate rear element index
        return q[rearIndex];    // Return the rear element
    }

    public boolean isEmpty() {
        if (size == 0) {        // Check if size is 0
            return true;        
        }
        return false;           
    }

    public boolean isFull() {
        if (size == capacity) { // Check if size equals capacity
            return true;       
        }
        return false;           // Return false if not full
    }
}

/**
 * Your MyCircularDeque object will be instantiated and called as such:
 * MyCircularDeque obj = new MyCircularDeque(k);        // Create a new deque with capacity k
 * boolean param_1 = obj.insertFront(value);            // Insert value at the front
 * boolean param_2 = obj.insertLast(value);             // Insert value at the rear
 * boolean param_3 = obj.deleteFront();                 // Delete front element
 * boolean param_4 = obj.deleteLast();                  // Delete rear element
 * int param_5 = obj.getFront();                        // Get the front element
 * int param_6 = obj.getRear();                         // Get the rear element
 * boolean param_7 = obj.isEmpty();                     // Check if deque is empty
 * boolean param_8 = obj.isFull();                      // Check if deque is full
 */
