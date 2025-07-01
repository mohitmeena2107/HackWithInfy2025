## 🚀 Greedy Section

### 🔹 1. Activity Selection Pattern

- **Problem:** [Maximum Length of Pair Chain – LeetCode](https://leetcode.com/problems/maximum-length-of-pair-chain/description/)

- **Approach Summary:**  
  This problem follows the classic **Activity Selection Pattern**, where the goal is to choose the maximum number of non-overlapping intervals from a list of pairs.

  The array is first **sorted based on the second element** of each pair (i.e., the ending time). After sorting, we iterate through the list and greedily select the next interval only if its start time is greater than the end time of the last selected interval.  
  This greedy choice ensures we leave the most room for future selections, ultimately maximizing the chain length.

- **Algorithm Steps:**
  1. **Sort** all pairs by their end time (second element).
  2. Initialize `count = 1` and `lastEnd = end time of the first pair`.
  3. Loop through the sorted list:
     - If `currentPair[0] > lastEnd`, include it in the chain.
     - Update `lastEnd = currentPair[1]` and increment `count`.

- **Greedy Strategy Used:**  
  Always pick the **earliest finishing compatible interval** to maximize the number of selections.

- **Status:** ✅ **Solved**
