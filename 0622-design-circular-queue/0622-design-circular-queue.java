class MyCircularQueue {
    int[] q; // New array to store the elements in the queue.
    int front = 0, rear = 0, size = 0; // Variables used to insert and delete the elements from the queue.
    public MyCircularQueue(int k) {
        q = new int[k]; // Initialized the array of size k.
        Arrays.fill(q, -1); // Filled the array with -1.
    }
    
    public boolean enQueue(int value) {
        if(isFull()){ // If queue is full return false.
            return false;
        }
        if(isEmpty()){ // If queue is empty.
            front = rear = 0; // Point front and rear to 0;
            q[rear] = value; // Store the value at rear.
            size ++; // Increment the size.
            return true;
        }
        rear++; // If not empty, increment the rear
        size++; // Increment the size
        rear = rear % q.length; // Point rear to the next open position. 
        q[rear] = value; // Store the value at rear.
        return true;
    }
    
    public boolean deQueue() {
        if(isEmpty()){ // Check if queue is empty return false.
            return false;
        }
        q[front] = -1; // To delete the element from start store front as -1.
        size--; // Decrement the size.
        front ++; // Increase the front.
        front = front % q.length; // Set the front again to the next data value.
        return true;
    }
    
    public int Front() {
        return q[front]; // Gives front or last value.
    }
    
    public int Rear() {
        return q[rear]; // Gives the first member who entered the queue.
    }
    
    public boolean isEmpty() {
        return size == 0; // Check if it's empty or not.
    }
    
    public boolean isFull() {
        return size == q.length; // If size equals to the length of k.
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */