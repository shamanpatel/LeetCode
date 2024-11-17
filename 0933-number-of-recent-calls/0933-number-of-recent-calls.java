class RecentCounter {
    Queue<Integer> que;
    public RecentCounter() {
       que = new LinkedList<>(); // Initialize the queue. 
    }
    
    public int ping(int t) {
        que.add(t); // Added the current timestamp
        while(que.peek() < t - 3000){ // Remove outdated requests(older than t -3000)
            que.poll();
        }
        return que.size(); // Return the size of queue, which shows the number of recent calls.
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */