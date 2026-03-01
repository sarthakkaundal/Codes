// Approach
// Use a stack to store valid round scores.
// Traverse each operation in order.
// If "+", push the sum of the last two scores.
// If "D", push double of the last score.
// If "C", remove the last score.
// Otherwise, parse and push the numeric score.
// Sum all remaining stack values to get the final score.
// Time Complexity: O(n) — each operation is processed once.
// Space Complexity: O(n) — stack stores up to n scores.

class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st = new Stack<>();
        int sum=0;
        for(int i=0; i<operations.length; i++){
            if(operations[i].equals("+")){
                st.push(st.get(st.size()-1) + st.get(st.size() - 2));
            }else if(operations[i].equals("D")){
                st.push(st.peek() * 2 );
            } else if(operations[i].equals("C")){
                st.pop();
            }else{
                st.push(Integer.parseInt(operations[i]));
            }
        }

        while(!st.isEmpty()){
            sum += st.pop();
        }
        return sum;
    }
}