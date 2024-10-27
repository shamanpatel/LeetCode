class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        HashSet<Integer> one = new HashSet<>();  // Created a HashSet to store array nums1.
        HashSet<Integer> two = new HashSet<>();  // Ccreated a HashSet to store array nums2.
       for(int num : nums1){  //Adding the values in hashset one.
        one.add(num);
       }
       for(int num:nums2){   //Adding the values in hashset two.
        two.add(num);
       }
       List<Integer> arr = new ArrayList<>(); //Created a list to store the distinct integers.
       List<Integer> arr2 = new ArrayList<>(); //Created a list to store the distinct integers from nums2.

       for(int num : one){  
        if(!two.contains(num)){ // Check distincnt elements in nums2.
            arr.add(num);
        }
       }
       for(int num : two){
        if(!one.contains(num)){  // Check distinct elemets in nums1/
            arr2.add(num);
        }
       }
       List<List<Integer>> result = new ArrayList<>(); // Created a list of list of Integers that store the list values of num1 and num2.
       result.add(arr);
       result.add(arr2); // Add both list and return the result.
       return result;
    }
}