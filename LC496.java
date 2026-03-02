// Approach: Brute Force
// This solution uses a straightforward Brute Force strategy.
// For every element x in the nums1 array:
// Find the match: Iterate through nums2 to find the index (idx) where nums2[j] == x.
// Find the next greater element: Start a new search in nums2 from idx + 1 to the right end of the array.
// The moment you find an element strictly greater than x, you store it in 
// next and break out of the loop.
// If no such element is found, next remains unchanged as -1.
// Store the final result for that element in the res array.
// Space Complexity: O(1) (excluding the output array).
// Time Complexity: O(N*M), where N is the length of nums1 and M is the length of nums2.


class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] res = new int[nums1.length];
        for(int i=0; i<nums1.length; i++){
            int x = nums1[i];
            int idx = -1;
            for(int j=0; j<nums2.length; j++){
                if(nums2[j] == x){
                    idx = j;
                    break;
                }
            }
            int next = -1;
            for(int j=idx+1; j<nums2.length; j++){
                if(nums2[j] > x){
                    next = nums2[j];
                    break;
                }
            }
            res[i] = next;
        }
        return res;        
    }
} 