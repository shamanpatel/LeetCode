class Solution {
    public int[] minOperations(String boxes) {
        int n = boxes.length();
        int[] ans = new int[n];
        for(int i = 0; i<n; i++){
            int moves = 0;
            for(int j = 0; j < n; j++){
                if(i == j) continue;
                if(boxes.charAt(j) == '0') continue;
                moves += Math.abs(i-j);
            }
            ans[i] = moves;
        }
        return ans;
    }
}