// Approach
// Use prefix sum array to avoid recomputing sums for every query
// prefix[i] stores sum of elements from index 0 to i-1
// Prefix array size is nums.length + 1 to handle index 0 cleanly
// Build prefix array once in the constructor
// Range sum [left, right] is calculated as
// prefix[right + 1] - prefix[left]
// Subtraction removes elements before left
// Each query runs in O(1) time
// Preprocessing takes O(n) time
// Extra space used is O(n)

class NumArray {
    private int[] prefix;
    public NumArray(int[] nums) {
        prefix = new int[nums.length+1];
        for(int i=1; i<=nums.length; i++){
            prefix[i] = prefix[i-1] + nums[i-1];
        }
    }
    
    public int sumRange(int left, int right) {
        return prefix[right+1]-prefix[left];
    }
}
