### 2026-02-04
- Other: LC274.java
  Approach:
  - Sort the citations array in ascending order.
  - Let n be the total number of papers.
  - Traverse the array from left to right.
  - At index i, check if citations[i] ≥ n − i (papers remaining including current).
  - The first index where this holds gives the maximum possible H-index (n − i).
  - If no index satisfies the condition, return 0.
