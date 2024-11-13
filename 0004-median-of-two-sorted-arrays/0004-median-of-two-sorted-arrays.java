class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) { // Using merge sort to sort the two arrays
       int a = nums1.length; 
       int b = nums2.length;
       int[] merged_arr = new int[a + b]; // Implemented new array that will store the sorted array.
       int i = 0; int j = 0; int k = 0; // Three variables declared, two for interating in two arrays and one to store it in new array.

       while(i < a && j < b){ // Check the elements of both arrays and store it in new aaray.
        if(nums1[i] < nums2[j]){
            merged_arr[k++] = nums1[i++];
        }
        else{
            merged_arr[k++] = nums2[j++];
        }
       }
       while(i < a){ // Add the left over numbers from the array one.
        merged_arr[k++] = nums1[i++];
       }
       while(j < b){  // Add the left over numbers from the second array.
        merged_arr[k++] = nums2[j++];
        }
        int length = a + b; 
        if(length % 2 == 0){ // If the length of new array is even return median of middle and middle - 1.
            return(merged_arr[length / 2 - 1] + merged_arr[length / 2]) / 2.0;
        }
        else{
            return (merged_arr[length / 2]); // If it is odd return the middle value.
        }
    }
}