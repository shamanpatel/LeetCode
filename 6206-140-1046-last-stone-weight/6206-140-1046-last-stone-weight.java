class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder()); // Using Heap, reverse the order of queue
        for(int i : stones){ // Add all elements in the queue.      
            pq.add(i);
        }
        while(pq.size() != 1){ // Run until the length of queue is 1
            int y = pq.remove(); // Remove first element and second element
            int x = pq.remove();

            if(x == y){ // If condition match do nothing
                pq.add(0);
            }
            if(x != y){
                pq.add(y - x); // If not equal store the difference
            }
        }
        return pq.peek(); // Return the last element in the queue.
    }
}