// Approach
// Use a stack to store indices of days with decreasing temperatures.
// Traverse the array from left to right.
// For each day i, while the stack is not empty and current temperature is higher than the temperature at the index on top of the stack:
// Pop the index prev from the stack.
// The answer for prev is i - prev (days waited for a warmer temperature).
// Push the current index i onto the stack.
// Indices left in the stack have no warmer future day, so their result remains 0.
// Time: O(n) (each index pushed and popped once)
// Space: O(n) (stack + result array)

class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] res = new int[temperatures.length];

        Stack<Integer> stack = new Stack<>();

        for(int i=0; i<temperatures.length; i++){

            while(!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]){
                int prev = stack.pop();
                res[prev] = i-prev;
            }
            stack.push(i);
        }
        return res;
    }
}