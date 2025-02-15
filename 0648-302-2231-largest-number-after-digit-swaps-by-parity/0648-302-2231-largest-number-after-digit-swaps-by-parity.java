class Solution {
    public int largestInteger(int num) {
        String str = Integer.toString(num);
        PriorityQueue<Integer> odd = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> even = new PriorityQueue<>(Collections.reverseOrder());
        for(char ch : str.toCharArray()){
            int value = ch - '0';
            if(value % 2 == 0){
                even.add(value);
            }
            else{
                odd.add(value);
            }
        }
        int largestNum = 0;
        for(char ch : str.toCharArray()){
            largestNum *= 10;
            if((ch - '0') % 2 == 0){
                largestNum += even.poll();
            }
            else{
                largestNum += odd.poll();
            }
        }
        return largestNum;
    }
}