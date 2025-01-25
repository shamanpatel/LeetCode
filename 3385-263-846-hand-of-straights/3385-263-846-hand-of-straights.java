class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize){
        if(hand.length % groupSize != 0){
            return false;
        }
        Map<Integer, Integer> map = new TreeMap<>();
        for(int i : hand){
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        for(int key : map.keySet()){
            if(map.get(key) > 0){
                for(int i = 1; i < groupSize; i++){
                    if(map.getOrDefault(key + i, 0) < map.get(key)){
                        return false;
                    }
                    map.put(key + i, map.get(key + i) - map.get(key));
                }
            }
        }
        return true;
    }
}