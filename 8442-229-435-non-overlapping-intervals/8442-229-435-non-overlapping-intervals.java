class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[1] - b[1]);
        int interval_count = 0;
        int prev = intervals[0][1];

        for(int i = 1; i < intervals.length; i++){
            if(prev > intervals[i][0]){
                interval_count++;
            }
            else{
                prev = intervals[i][1];
            }
        }
        return interval_count;
    }
}