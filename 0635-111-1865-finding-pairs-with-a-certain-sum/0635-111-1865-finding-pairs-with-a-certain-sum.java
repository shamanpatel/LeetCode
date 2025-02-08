class FindSumPairs {
    private int[] nums1;
    private int[] nums2;
    private HashMap<Integer, Integer> map1 = new HashMap<>();
    private HashMap<Integer,Integer> map2 = new HashMap<>(); 
    public FindSumPairs(int[] nums1, int[] nums2) {
        this.nums1 = nums1;
        this.nums2 = nums2;
        this.map1 = new HashMap<>();
        this.map2 = new HashMap<>();

        for(int i = 0; i < nums1.length; i++){
            map1.put(nums1[i], map1.getOrDefault(nums1[i], 0) + 1);
        }
        for(int i = 0; i < nums2.length; i++){
            map2.put(nums2[i], map2.getOrDefault(nums2[i], 0) + 1);
        }
    }
    
    public void add(int index, int val) {
        int curVal = nums2[index];
        int newVal = curVal + val;
        nums2[index] = newVal;
        map2.put(curVal, map2.get(curVal) - 1);
        if (map2.get(curVal) == 0) {
            map2.remove(curVal);
        }
        map2.put(newVal, map2.getOrDefault(newVal, 0) + 1);
    }
    
    public int count(int total) {
        int count = 0;
        for(int i : map1.keySet()){
            int difference = total - i;
            if(map2.containsKey(difference)){
                count += map1.get(i) * map2.get(difference);
            }
       }
       return count; 
    }
}

/**
 * Your FindSumPairs object will be instantiated and called as such:
 * FindSumPairs obj = new FindSumPairs(nums1, nums2);
 * obj.add(index,val);
 * int param_2 = obj.count(tot);
 */