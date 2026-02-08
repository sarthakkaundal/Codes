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

### 2026-02-07
- Other: LC278.java
  Approach:
  - Use binary search on versions 1 to n because once a version is bad, all later versions are also bad (monotonic property).
  - Start with low = 1 and high = n.
  - While low < high, compute mid safely to avoid overflow.
  - If mid is bad, the first bad version is at mid or before it, so move high = mid.
  - If mid is good, the first bad version must be after it, so move low = mid + 1.
  - When the loop ends, low == high, which points to the first bad version.
  - Time complexity is O(log n) and space complexity is O(1).


### 2026-02-08
- Other: LC110.java
  Approach:
  - Use a recursive helper function that computes the height of the tree while simultaneously checking balance.
  - The helper function follows these rules:
  - If the current node is null, return height 0.
  - Recursively compute the heights of the left and right subtrees.
  - If either subtree is already unbalanced (indicated by height -1), immediately return -1.
  - If the absolute difference between left and right subtree heights is greater than 1, return -1 to signal imbalance.
  - Otherwise, return the height of the current subtree as
  - 1 + max(leftHeight, rightHeight).
  - The main function calls the helper on the root:
  - If the helper returns -1, the tree is not balanced.
  - Otherwise, the tree is balanced.
  - Time Complexity: O(n) — each node is visited once.
  - Space Complexity: O(h) — recursion stack space, where h is the height of the tree (worst case O(n)).
