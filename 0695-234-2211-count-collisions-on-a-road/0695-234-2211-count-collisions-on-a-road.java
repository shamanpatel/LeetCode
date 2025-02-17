class Solution {
    public int countCollisions(String directions) {
       int collisions = 0;
       Stack<Character> st = new Stack<>();
       st.push(directions.charAt(0));

       for(int i = 1; i < directions.length(); i++){
        char ch = directions.charAt(i);
        if((st.peek() == 'R' && ch == 'L')){
            collisions += 2;
            st.pop();
            ch = 'S';
        }
        else if((st.peek() == 'S' && ch == 'L')){
            ch = 'S';
            collisions += 1;
        }
        while(!st.isEmpty() && (st.peek() == 'R' && ch == 'S')){
            collisions += 1;
            st.pop();
        }
        st.push(ch);
       }
       return collisions;
    }
}