// Approach: Iterative String Construction
// The code uses a brute force / iterative approach to simulate the exact process described in the problem statement.

// -It initializes the base string S1 as "0".
// -It loops from i = 2 up to n, iteratively constructing S_i by concatenating:
// The previous string S_{i-1}
// A "1"
// The inverted and reversed version of S_{i-1}
// It uses StringBuilder (in both reverse() and invert() helper functions, as well as the main loop) to efficiently append characters, reverse strings, and construct the new string S_i.
// Once the string S_n is fully built, it returns the character at the 0-based index k - 1.
// time complexity: O(n^2)
// space complexity: O(n^2)

class Solution {
    public char findKthBit(int n, int k) {
        String s = "0";
        for(int i=2; i<=n; i++){
            StringBuilder sb = new StringBuilder();
            sb.append(s);
            sb.append("1");
            sb.append(reverse(invert(s)));
            s = sb.toString();
        }
        return s.charAt(k-1);
    }

    private String reverse(String s){
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        return sb.toString();
    }

    private String invert(String s){
        StringBuilder sb = new StringBuilder();
        for(char c : s.toCharArray()){
            if(c == '0'){
                sb.append('1');
            }else{
                sb.append('0');
            }
        }
        return sb.toString();
    }
}