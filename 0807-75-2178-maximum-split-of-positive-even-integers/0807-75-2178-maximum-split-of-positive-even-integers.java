class Solution {
    public List<Long> maximumEvenSplit(long finalSum) {
        List<Long> list = new ArrayList<>();
        if (finalSum % 2 != 0) {
            return list;
        }
        long sum = 0;
        long i = 2;
        
        while (sum + i <= finalSum) { 
            list.add(i);
            sum += i;
            i += 2;
        }

        // Adjust last element to make sum == finalSum
        if (!list.isEmpty()) {
            list.set(list.size() - 1, list.get(list.size() - 1) + (finalSum - sum));
        }
        return list;
    }
}