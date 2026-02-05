// Approach
// We iterate once over the circular array using modulo arithmetic.
// For each index i, the value nums[i] tells how many steps to move from i.
// If the step is positive, we move forward; if negative, we move backward.
// Modulo n keeps the index within bounds, and adding n handles negative jumps safely.
// The value at the computed index is stored in result[i].
// A do-while loop ensures every index is visited exactly once, giving O(n) time and O(n) space.

class Solution {
    public int[] constructTransformedArray(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        int start = 0;
        int i = start;
        do{
            int step = nums[i];
            int idx;
            if(step<0){
                idx = (i + step%n +n) % n;
            }else{
                idx = (i+step)%n;
            }
            result[i] = nums[idx];
            i = (i+1)%n;
        }while(i != start);
        return result;
    }
}