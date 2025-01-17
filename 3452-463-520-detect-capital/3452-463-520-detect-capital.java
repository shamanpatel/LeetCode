class Solution {
    public boolean detectCapitalUse(String word) {
        if (word.length() < 2) {
            return true;
        }
        return detectCapital(word);
    }

    private boolean detectCapital(String word) {
        // Check if the first character is uppercase
        if (Character.isUpperCase(word.charAt(0))) {
            // If the second character is uppercase, all subsequent characters must be uppercase
            if (Character.isUpperCase(word.charAt(1))) {
                for (int i = 2; i < word.length(); i++) {
                    if (!Character.isUpperCase(word.charAt(i))) {
                        return false;
                    }
                }
            } else {
                // If the second character is lowercase, all subsequent characters must be lowercase
                for (int i = 2; i < word.length(); i++) {
                    if (Character.isUpperCase(word.charAt(i))) {
                        return false;
                    }
                }
            }
        } else {
            // If the first character is lowercase, all subsequent characters must be lowercase
            for (int i = 1; i < word.length(); i++) {
                if (Character.isUpperCase(word.charAt(i))) {
                    return false;
                }
            }
        }
        return true;
    }
}