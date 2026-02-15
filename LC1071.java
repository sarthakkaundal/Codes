// Approach 
// Validate compatibility
// First check whether both strings are built from the same repeating pattern by comparing str1 + str2 and str2 + str1.
// If they are not equal, no common divisor string exists, so return an empty string.
// If a common base string exists, its length must divide both string lengths.
// Therefore, compute the GCD of str1.length() and str2.length().
// The greatest common divisor string must be the prefix of either string with length equal to this GCD.
// Return str1.substring(0, gcd).
// Time Complexity: O(n + m), where n and m are lengths of str1 and str2.
// Space Complexity: O(1)

class Solution {
    public String gcdOfStrings(String str1, String str2) {
    if(!(str1+str2).equals(str2+str1)){
        return "";
    }

    int gcd = gcd(str1.length(), str2.length());
    return str1.substring(0, gcd);
}

private static int gcd(int a, int b){
    while( b != 0){
        int temp = b;
        b = a % b;
        a = temp;
    }
    return a;
    }
}