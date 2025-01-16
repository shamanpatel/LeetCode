class Solution {
    public int countSegments(String s) {
        String[] segments = s.split(" "); // Split the String accroding to space.
        int count = 0;
        for(String i : segments){
            if(!i.isEmpty()){ // If is is not empty increment the count.
                count++;
            }
        }
        return count; // Return the count
    }
}