// Approach
// The array is sorted, so binary search can be used to locate the required range efficiently.
// Instead of trying to find both boundaries in one pass, we perform two separate binary searches:
// Find the first occurrence (start index)
// Perform binary search.
// When nums[mid] == target, record mid as a potential answer.
// Continue searching left half (right = mid - 1) to find an earlier occurrence.
// If nums[mid] < target, move right.
// If nums[mid] > target, move left.
// Find the last occurrence (end index)
// Perform binary search again.
// When nums[mid] == target, record mid as a potential answer.
// Continue searching right half (left = mid + 1) to find a later occurrence.
// If nums[mid] < target, move right.
// If nums[mid] > target, move left.
// If the target does not exist, both searches return -1.
// Time Complexity: O(n logn)
// Space: O(1)

class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n = nums.length;
        if(n==0) return new int[]{-1, -1};
        int startIndex= findStart(nums, target);
        int lastIndex= findLast(nums,target);
        
        return new int[]{startIndex, lastIndex};
    }

    private int findStart(int[] nums, int target){
        int ans = -1;
        int left=0;
        int right = nums.length-1;
        while(left<=right){
            int mid = left + (right-left)/2;
            if(nums[mid] == target){
                ans = mid;
                right = mid-1;
            }else if(nums[mid] < target){
                left = mid + 1;
            }else{
                right = mid-1;
            }
        }
        return ans;
    }

    private int findLast(int[] nums, int target){
        int ans = -1;
        int left=0;
        int right = nums.length-1;
        while(left<=right){
            int mid = left + (right-left)/2;
            if(nums[mid] == target){
                ans = mid;
                left = mid + 1;
            }else if(nums[mid] < target){
                left = mid+1;
            }else{
                right = mid-1;
            }
        }
        return ans;
    }
}