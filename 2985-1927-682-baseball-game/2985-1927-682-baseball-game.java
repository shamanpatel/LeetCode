
class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st = new Stack<>();
        for(int i = 0; i < operations.length; i++){
            if(operations[i].equals("+")){
                int a = st.pop();
                int b = st.peek();
                st.push(a);
                st.push(a + b);
            }
            else if(operations[i].equals("C")){
                st.pop();
            }
            else if(operations[i].equals("D")){
                st.push(2 * st.peek());
            }
            else{
                int a = Integer.parseInt(operations[i]);
                st.push(a);
            }
        }
        int result = 0;
        for(int i : st){
            result += i;
        }
        return result;
    }
}
