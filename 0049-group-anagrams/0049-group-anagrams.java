class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>(); // Created a HashMap of Key as String and values as List of Strings.

        for(String charc : strs){  // Store every string to array of characters strings.
            char[] chars = charc.toCharArray();
            Arrays.sort(chars);
            String sorted = new String(chars); // Sort the charcter string.

            if(!map.containsKey(sorted)){  // Check if the sorted string is not in map add the sorted sstring and create a new Array list to store the similar strings.
                map.put(sorted, new ArrayList<>());
            }
            map.get(sorted).add(charc); // Add the similar strings. 
        }
        return new ArrayList<>(map.values()); // Return the arraylist with similar strings.
    }
}