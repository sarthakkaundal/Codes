// Approach
// Handle the base cases first: if the input number is 0 or 1, return the number itself since its square root is the same.
// For all other values, apply binary search to find the integer square root.
// Initialize two pointers:
// low as 1
// high as x
// At each step:
// Compute mid as the average of low and high.
// If mid × mid equals x, mid is the exact square root, so return it.
// If mid × mid is greater than x, the square root lies in the left half, so move high to mid − 1.
// If mid × mid is less than x, store mid as a possible answer and move low to mid + 1.
// Continue until the search space is exhausted.
// The stored value in ans represents the largest integer whose square is less than or equal to x, which is the required integer square root.

class Solution {
    public int mySqrt(int x) {
        if(x == 0 || x == 1 )return x;
        long low = 1;
        long high = x ;
        long ans = 0;
        while(low <= high){
            long mid = low + (high-low)/2;
            if(mid*mid == x)return (int)mid;
            if(mid*mid > x){
                high = mid-1;
            }else{
                ans = mid;
                low = mid+1;
            }
        }
    return (int)ans;
    }
}