class KthLargest {
    PriorityQueue<Integer> pq = new PriorityQueue<>(); // Using heap to get the k largest element
    int k; 
    public KthLargest(int k, int[] nums) { // Constructor of the given class.
        this.k = k;
        for(int i : nums){ // Add all elements in the queue
            pq.offer(i);
        }
        while(pq.size() > k){ // Remove the elements until the size of k
            pq.poll();
        }
    }
    
    public int add(int val) {
        pq.add(val); // Add element in the queue    
        while(pq.size() > k){ // If the size if greater remove the top element of the queue
            pq.poll();
        } 
        return pq.peek(); // Return the first element of the queue.
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */