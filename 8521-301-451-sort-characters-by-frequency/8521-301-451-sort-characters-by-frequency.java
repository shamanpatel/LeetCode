class Solution {
    public String frequencySort(String s){
        HashMap<Character, Integer> map = new HashMap<>(); // HashMap to store the frequency of the characters.
        for(char ch : s.toCharArray()){ // Put all the character in the map with the number of frequency.
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        PriorityQueue<Map.Entry<Character, Integer>> pq = new PriorityQueue<>(
            (a, b) -> b.getValue() - a.getValue() // Sort the elements in the queue based on their frequencies
        );
        pq.addAll(map.entrySet()); // Add all characters in the Queue.

        StringBuilder sb = new StringBuilder();
        while(!pq.isEmpty()){
            Map.Entry<Character, Integer> hm = pq.poll(); // Again store it in the map as they are sorted now.
            sb.append(String.valueOf(hm.getKey()).repeat(hm.getValue())); // Get the character from the map from the key and corresponding value.
        }
        return sb.toString(); // Return the String.
    }
}