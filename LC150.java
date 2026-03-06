// Approach
// This is problem which directly models on the stacks, LIFO(Last In Fast Out behaviour)
// we first make a new stack object called st
// we simply iterate over the given array and check is it not an operator then we push it to the stack
// if it is an operator
// then we pop the two top elements of the stack and store them in variables b and a respectively
// if the given string in array comes out to be an operator, we check which operator it is - "+", "-", "*" or "/"
// then we check which exact operation we need to perform and perfom it on a and b .
// then the result of a particular operation is pushed back to the stack
// after completing the entire traversal and performing all operations, only the result is left 
// in the stack, which we then return using peek() method.
// Time Complexity : O(n)
// Space Complexity : O(n)

class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        for(String c : tokens){
            if(!c.equals("+") && !c.equals("-") && !c.equals("*") && !c.equals("/")){
                st.push(Integer.parseInt(c));
            }else{
                int b = st.pop();
                int a = st.pop();

                if(c.equals("+")) st.push(a+b);
                else if(c.equals("-")) st.push(a-b);
                else if(c.equals("*")) st.push(a*b);
                else st.push(a/b);
            }
        }
        return st.peek();
    }
}