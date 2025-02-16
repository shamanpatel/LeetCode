import java.util.*;

class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();
        ArrayList<Integer> list = new ArrayList<>();

        for(int i : asteroids) {
            // Process the asteroid only when it's moving left
            while (!st.isEmpty() && i < 0 && st.peek() > 0) {
                if (Math.abs(i) > st.peek()) {
                    st.pop();
                    continue;
                } else if (Math.abs(i) == st.peek()) {
                    st.pop();
                }
                i = 0; // Set to 0 to stop processing this asteroid further
            }

            if (i != 0) {
                st.push(i); // If the asteroid survives, add it to the stack
            }
        }

        // Transfer the elements from the stack to the list
        while (!st.isEmpty()) {
            list.add(st.pop());
        }

        // Reverse the list to get the correct order
        Collections.reverse(list);

        // Convert the list to an array and return
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    }
}
