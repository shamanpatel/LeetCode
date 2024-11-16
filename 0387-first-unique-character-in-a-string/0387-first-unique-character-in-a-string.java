class Solution {
    public int firstUniqChar(String s) {
        int[] freq = new int[26]; // Frequency array for characters
        Queue<Integer> q = new LinkedList<>(); // Queue to store indices of characters

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            freq[ch - 'a']++; // Increment frequency of the character
            q.add(i); // Add index of the character to the queue
        }

        while (!q.isEmpty() && freq[s.charAt(q.peek()) - 'a'] > 1) {
            q.poll(); // Remove indices of non-unique characters
        }

        return q.isEmpty() ? -1 : q.peek(); // Return index of first unique char or -1
    }
}