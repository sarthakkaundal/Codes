// Approach
// Use binary search on versions 1 to n because once a version is bad, all later versions are also bad (monotonic property).
// Start with low = 1 and high = n.
// While low < high, compute mid safely to avoid overflow.
// If mid is bad, the first bad version is at mid or before it, so move high = mid.
// If mid is good, the first bad version must be after it, so move low = mid + 1.
// When the loop ends, low == high, which points to the first bad version.
// Time complexity is O(log n) and space complexity is O(1).

/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int low = 1;
        int high = n;
        while(low < high){
            int mid = low + (high-low)/2;
            if(isBadVersion(mid)){
                high = mid;
            }else{
                low = mid + 1;
            }
        }
        return low;
    }
}