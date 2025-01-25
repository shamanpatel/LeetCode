class Solution {
    public String bestHand(int[] ranks, char[] suits) {

        HashMap<Integer, Integer> rankCount = new HashMap<>();
        HashMap<Character, Integer> suitCount = new HashMap<>();

        // Count the frequency of each rank
        for (int num : ranks) {
            rankCount.put(num, rankCount.getOrDefault(num, 0) + 1);
        }

        // Count the frequency of each suit
        for (char c : suits) {
            suitCount.put(c, suitCount.getOrDefault(c, 0) + 1);
        }

        // Check if all cards have the same suit -> "Flush"
        if (suitCount.containsValue(5)) {
            return "Flush";
        }

        // Check for "Three of a Kind"
        for (int count : rankCount.values()) {
            if (count >= 3) { // Checks for exactly three or more cards of the same rank
                return "Three of a Kind";
            }
        }

        // Check for "Pair"
        for (int count : rankCount.values()) {
            if (count == 2) { // Checks for exactly two cards of the same rank
                return "Pair";
            }
        }

        // If no other hand matches -> "High Card"
        return "High Card";
    }
}