// Approach
// Clean the string
// Remove all non-alphanumeric characters using regex.
// Normalize case
// Convert the string to lowercase to ignore case differences.
// Reverse the string
// Use StringBuilder to reverse the cleaned string.
// Compare
// If original and reversed strings are equal, it is a palindrome.
// Complexity
// Time: O(n)
// Space: O(n)


class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        StringBuilder sb = new StringBuilder(s);
        String c = sb.reverse().toString();

        return s.equals(c);
    }
}