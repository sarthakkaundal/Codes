// Approach
// Initialize xor with n (array length).
// Iterate i from 0 to n-1.
// XOR xor with index i.
// XOR xor with value nums[i].
// All numbers from 0 to n appear twice except the missing one.
// XOR cancels duplicates (a ^ a = 0).
// Remaining value in xor is the missing number.
// Time: O(n), Space: O(1).

class Solution {
    public int missingNumber(int[] nums) {
        int xor = nums.length;
        for (int i = 0; i < nums.length; i++) {
            xor ^= i;
            xor ^= nums[i];
        }
        return xor;
    }
}
