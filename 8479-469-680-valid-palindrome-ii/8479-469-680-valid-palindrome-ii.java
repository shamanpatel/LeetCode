class Solution {
     public boolean validPalindrome(String s) {
        Stack<int[]> stack = new Stack<>();
        int left = 0, right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                // Push both possibilities to stack (remove left or right)
                stack.push(new int[]{left + 1, right});
                stack.push(new int[]{left, right - 1});
                break;
            }
            left++;
            right--;
        }

        while (!stack.isEmpty()) {
            int[] indices = stack.pop();
            if (isPalindrome(s, indices[0], indices[1])) {
                return true;
            }
        }

        return isPalindrome(s, left, right);
    }

    private boolean isPalindrome(String s, int left, int right) {
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}