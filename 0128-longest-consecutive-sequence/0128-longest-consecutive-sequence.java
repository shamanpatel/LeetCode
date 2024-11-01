class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> numSet = new HashSet<>();  // Add the nums witout repeating it.
        for (int num : nums) {
            numSet.add(num);
        }

        int sequence = 0; // Initialize te sequence

        for (int num : numSet) {
            if (!numSet.contains(num - 1)) {  // Check if num -1 is present in the array or not.
                int currentNum = num;  // If it's not the assign num to currentNum and put streak as 1.
                int currentStreak = 1;

                while (numSet.contains(currentNum + 1)) { // If the set contains currNum + 1.
                    currentNum++; 
                    currentStreak++;
                }

                sequence = Math.max(sequence, currentStreak); // The new sequence will be max of current and previosu streak
            }
        }

        return sequence;
    }
}