class Solution {
    public String kthDistinct(String[] arr, int k) {
        HashMap<String, Integer> map = new HashMap<>();
        for(String str : arr){
            map.put(str, map.getOrDefault(str, 0) + 1);
        }
        String result = "";
        int count = 0;
        for(String str : arr){
            if(map.get(str) == 1){
                result = str;
                count++;
            }
            if(count == k){
                return result;
            }
        }
        return "";
    }
}