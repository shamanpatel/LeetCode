
class Solution {
    public int calPoints(String[] operations) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < operations.length; i++) {
            String op = operations[i];

            if (op.matches("-?\\d+")) { // Check if it's a number (positive or negative)
                list.add(Integer.parseInt(op));
            } 
            else if (op.equals("C")) { // Remove the last valid score
                if (!list.isEmpty()) {
                    list.remove(list.size() - 1);
                }
            } 
            else if (op.equals("D")) { // Double the last valid score
                if (!list.isEmpty()) {
                    list.add(2 * list.get(list.size() - 1));
                }
            } 
            else if (op.equals("+")) { // Sum the last two valid scores
                if (list.size() >= 2) {
                    list.add(list.get(list.size() - 1) + list.get(list.size() - 2));
                }
            }
        }

        // Calculate the total sum of scores
        int sum = 0;
        for (int num : list) {
            sum += num;
        }

        return sum;
    }
}
