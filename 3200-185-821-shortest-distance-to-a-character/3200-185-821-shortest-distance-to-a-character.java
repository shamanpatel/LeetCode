class Solution {
    public int[] shortestToChar(String s, char c) {
        int[] distance = new int[s.length()];
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == c){
                list.add(i);
            }
        }
        for(int i = 0; i < s.length(); i++){
            int min = Integer.MAX_VALUE;
            for(int j = 0; j < list.size(); j++){
                min = Math.min(min, Math.abs(i - list.get(j)));
            }
            distance[i] = min;
        }
        return distance;  
    }
}