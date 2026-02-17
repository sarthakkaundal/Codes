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

### 2026-02-09
- Other: LC34.java
  Approach:
  - The array is sorted, so binary search can be used to locate the required range efficiently.
  - Instead of trying to find both boundaries in one pass, we perform two separate binary searches:
  - Find the first occurrence (start index)
  - Perform binary search.
  - When nums[mid] == target, record mid as a potential answer.
  - Continue searching left half (right = mid - 1) to find an earlier occurrence.
  - If nums[mid] < target, move right.
  - If nums[mid] > target, move left.
  - Find the last occurrence (end index)
  - Perform binary search again.
  - When nums[mid] == target, record mid as a potential answer.
  - Continue searching right half (left = mid + 1) to find a later occurrence.
  - If nums[mid] < target, move right.
  - If nums[mid] > target, move left.
  - If the target does not exist, both searches return -1.
  - Time Complexity: O(n logn)
  - Space: O(1)

### 2026-02-10
- Other: LC69.java
  Approach:
  - Handle the base cases first: if the input number is 0 or 1, return the number itself since its square root is the same.
  - For all other values, apply binary search to find the integer square root.
  - Initialize two pointers:
  - low as 1
  - high as x
  - At each step:
  - Compute mid as the average of low and high.
  - If mid × mid equals x, mid is the exact square root, so return it.
  - If mid × mid is greater than x, the square root lies in the left half, so move high to mid − 1.
  - If mid × mid is less than x, store mid as a possible answer and move low to mid + 1.
  - Continue until the search space is exhausted.
  - The stored value in ans represents the largest integer whose square is less than or equal to x, which is the required integer square root.

### 2026-02-11
- Other: LC206.java
  Approach:
  - We iterate through the linked list while reversing the direction of each node’s `next` pointer.
  - At every step, we first save the next node to avoid losing the remaining list, then point the current node’s `next` to the previous node.
  - After reversing the link, we move the `prev` pointer to the current node and advance the `curr` pointer to the saved next node.
  - We continue this process until `curr` becomes `null`.
  - Finally, `prev` points to the new head of the reversed list and is returned.
  - time complexity: O(n)
  - space complexity: O(1)

### 2026-02-11
- Other: LC203.java
  Approach:
  - Use a dummy node before head so deletion logic is uniform, even when the head node itself must be removed.
  - Maintain two pointers:
  - curr to traverse the list.
  - prev to track the last node that is kept.
  - Traverse the list:
  - If curr.val == val, remove the node by linking prev.next to curr.next.
  - Otherwise, keep the node and move prev forward.
  - Always move curr forward.
  - Return dummy.next, which represents the updated head.
  - Time Complexity
  - O(n) — each node is visited once.
  - Space Complexity
  - O(1) — only constant extra space is used.



### 2026-02-12
- Other: LC160.java

### 2026-02-12
- Other: LC160.java
  Approach:
  - Use two pointers, currA starting at headA and currB starting at headB.
  - Traverse both lists one step at a time.
  - When a pointer reaches the end (null), redirect it to the head of the other list.
  - This redirection makes both pointers traverse the same total distance (lengthA + lengthB).
  - If an intersection exists, both pointers will eventually point to the same node at the same time.
  - If no intersection exists, both pointers will become null together and the loop ends.
  - Return the node where both pointers meet (or null if they don’t).
  - Complexity
  - Time: O(n + m)
  - Space: O(1)


### 2026-02-13
- Other: LC24.java

### 2026-02-13
- Other: LC24.java
  Approach:
  - Use a dummy node before the head to simplify swapping when the first pair includes the head.
  - Maintain two pointers:
  - prev → points to the node before the current pair
  - curr → points to the first node of the current pair
  - Traverse the list while there are at least two nodes to swap.
  - For each pair:
  - Save the start of the next pair.
  - Identify the second node of the current pair.
  - Rewire three links to swap the pair:
  - First node points to the next pair.
  - Second node points to the first node.
  - Previous node points to the second node.
  - After swapping, move:
  - prev to the tail of the swapped pair.
  - curr to the start of the next pair.
  - Return dummy.next, which points to the new head after all swaps.
  - Time Complexity: O(n)
  - Space Complexity: O(1)






### 2026-02-15
- Other: LC1071.java
  Approach:
  - Validate compatibility
  - First check whether both strings are built from the same repeating pattern by comparing str1 + str2 and str2 + str1.
  - If they are not equal, no common divisor string exists, so return an empty string.
  - If a common base string exists, its length must divide both string lengths.
  - Therefore, compute the GCD of str1.length() and str2.length().
  - The greatest common divisor string must be the prefix of either string with length equal to this GCD.
  - Return str1.substring(0, gcd).
  - Time Complexity: O(n + m), where n and m are lengths of str1 and str2.
  - Space Complexity: O(1)

### 2026-02-16
- Other: LC303.java
  Approach:
  - Use prefix sum array to avoid recomputing sums for every query
  - prefix[i] stores sum of elements from index 0 to i-1
  - Prefix array size is nums.length + 1 to handle index 0 cleanly
  - Build prefix array once in the constructor
  - Range sum [left, right] is calculated as
  - prefix[right + 1] - prefix[left]
  - Subtraction removes elements before left
  - Each query runs in O(1) time
  - Preprocessing takes O(n) time
  - Extra space used is O(n)

### 2026-02-17
- Other: LC268.java
  Approach:
  - Initialize xor with n (array length).
  - Iterate i from 0 to n-1.
  - XOR xor with index i.
  - XOR xor with value nums[i].
  - All numbers from 0 to n appear twice except the missing one.
  - XOR cancels duplicates (a ^ a = 0).
  - Remaining value in xor is the missing number.
  - Time: O(n), Space: O(1).
