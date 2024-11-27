class Solution {
    public int findKthLargest(int[] nums, int k) {
      PriorityQueue<Integer> minHeap = new PriorityQueue<>(); // Implemented a minHeap.
      for(int i = 0; i<k; i++){ // Add the elements of size k.
        minHeap.offer(nums[i]);
      }
      for (int i = k; i < nums.length; i++) { // Now check the rest of the elements with the k size heap.
            if (nums[i] > minHeap.peek()) { // If the element is greater than current number
                minHeap.poll(); // Remove that number
                minHeap.offer(nums[i]); // And add that element from rear.
            }
        }
        
        return minHeap.peek(); // Return the top of the queue.
    } 
}