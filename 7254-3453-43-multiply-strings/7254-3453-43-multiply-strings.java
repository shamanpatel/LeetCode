class Solution {
    public String multiply(String num1, String num2) {
        if("0".equals(num1) || "0".equals(num2)){
            return "0";
        }
        int[] result = new int[num1.length() + num2.length() - 1];

        for(int i = 0; i < num1.length(); i++){
            for(int j = 0; j < num2.length(); j++){
                result[i + j] += (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
            }
        }
        for(int i = result.length - 1; i > 0; i--){
            result[i - 1] += result[i] / 10;
            result[i] %= 10;
        }

        StringBuilder sb = new StringBuilder();
        for(int i : result){
            sb.append(i);
        }
        return sb.toString();
    }
}