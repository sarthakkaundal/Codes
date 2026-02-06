// Approach
// Initialize a counter to store the length of the last word.
// Use trim() to remove leading and trailing spaces from the input string.
// Traverse the string from the end and increment the counter for each character until a space is encountered.
// Stop traversal when the first space before the last word is found and return the counter.
// Time Complexity : O(n)
// Space Complexity: O(1)


class Solution {
    public int lengthOfLastWord(String s) {
        int count = 0;
        s = s.trim();
        int n = s.length();
        for(int i = n-1; i>=0; i--){
            if(s.charAt(i) == ' ' ){
                break;
            }
            count++;
        }
        return count;
    }
}