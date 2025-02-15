import java.util.HashMap;

class Solution {
    public boolean checkIfExist(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : arr) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        for (int i : arr) {
            int num = i * 2;
            if (map.containsKey(num)) {
                if (num == i && map.get(num) == 1) continue; // Ensure it's not the same element
                return true;
            }
        }
        return false;
    }
}
