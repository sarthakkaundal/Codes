//  Approach:
//  There are only two possible valid alternating binary strings of length n:
//  1. Starts with '0' (e.g., "010101...")
//  2. Starts with '1' (e.g., "101010...")
//  We can iterate through the given string and count the number of differences
//  (operations)
//  required to match either of these two target strings.
//  - `start0` tracks changes needed to match the pattern starting with '0'.
//  - `start1` tracks changes needed to match the pattern starting with '1'.
//  Finally, we return the minimum of the two counts.
//  Time Complexity: O(n)
//  We iterate through the string of length n exactly once.
//  Space Complexity: O(1)
//  We only use two integer variables for counting, requiring constant extra
//  space.

class Solution {
    public int minOperations(String s) {
        int start0 = 0;
        int start1 = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (i % 2 == 0) {
                if (c != '0')
                    start0++;
                if (c != '1')
                    start1++;
            } else {
                if (c != '1')
                    start0++;
                if (c != '0')
                    start1++;
            }
        }

        return Math.min(start0, start1);
    }
}