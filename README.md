### 2026-02-04
- Other: LC274.java
  Approach:
  - Sort the citations array in ascending order.
  - Let n be the total number of papers.
  - Traverse the array from left to right.
  - At index i, check if citations[i] ≥ n − i (papers remaining including current).
  - The first index where this holds gives the maximum possible H-index (n − i).
  - If no index satisfies the condition, return 0.

### 2026-02-05
- Other: LC3379.java
  Approach:
  - We iterate once over the circular array using modulo arithmetic.
  - For each index i, the value nums[i] tells how many steps to move from i.
  - If the step is positive, we move forward; if negative, we move backward.
  - Modulo n keeps the index within bounds, and adding n handles negative jumps safely.
  - The value at the computed index is stored in result[i].
  - A do-while loop ensures every index is visited exactly once, giving O(n) time and O(n) space.

### 2026-02-06
- Other: LC58.java
  Approach:
  - Initialize a counter to store the length of the last word.
  - Use trim() to remove leading and trailing spaces from the input string.
  - Traverse the string from the end and increment the counter for each character until a space is encountered.
  - Stop traversal when the first space before the last word is found and return the counter.
  - Time Complexity : O(n)
  - Space Complexity: O(1)
