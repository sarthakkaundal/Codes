// Approach 
//  Use three pointers:
//    i = m - 1 → last valid element of `nums1`
//    j = n - 1 → last element of `nums2`
//    k = m + n - 1 → last index of `nums1`
//  Compare `nums1[i]` and `nums2[j]` from the back.
//  Place the larger element at `nums1[k]`.
//  Decrement the corresponding pointer (`i` or `j`) and `k`.
//  Continue until all elements of `nums2` are merged.
//  No extra space used since merging is done in-place.


class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1, j = n - 1, k = m + n - 1;

        while (j >= 0) {
            if (i >= 0 && nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }
    }
}