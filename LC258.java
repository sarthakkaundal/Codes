// Approach
// Repeatedly sum the digits of the number until a single digit remains; 
// this can be optimized using the digital root formula 1 + (num − 1) % 9 (except when num = 0).

// time:O(1)
// space :O(1)

class Solution {
    public int addDigits(int num) {
        if (num == 0) return 0;
        return 1 + (num - 1) % 9;
    }
}