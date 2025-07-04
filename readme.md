## 🚀 Greedy Algorithms – Problem Log

---

### 🔹 1. Activity Selection Problem

- **Problem Link:** [Maximum Length of Pair Chain – LeetCode](https://leetcode.com/problems/maximum-length-of-pair-chain/)
- **Approach Summary:**  
  Sort activities by their end time. Then iterate and greedily select the next activity only if it starts after the last selected one ends. This ensures the maximum number of non-overlapping intervals are chosen.
- **Status:** ✅ Solved

---

### 🔹 2. Fractional Knapsack Problem

- **Problem Link:** [Maximum Units on a Truck – LeetCode](https://leetcode.com/problems/maximum-units-on-a-truck/)
- **Approach Summary:**  
  Sort items by their value-to-weight ratio in descending order. Then greedily pick as much as possible from the highest ratio items until the knapsack is full.
- **Status:** ✅ Solved

---

### 🔹 3. Minimum Number of Coins

- **Problem Link:** [Coin Change – LeetCode](https://leetcode.com/problems/coin-change/)
- **Approach Summary:**  
  Sort the coin denominations in descending order. Greedily pick the largest denomination that fits into the remaining amount until it reaches zero.
- **Status:** ✅ Solved

---

### 🔹 4. Job Sequencing Problem

- **Problem Link:** [Maximum Profit in Job Scheduling – LeetCode](https://leetcode.com/problems/maximum-profit-in-job-scheduling/)
- **Approach Summary:**  
  Sort jobs by thier finish time. apply binary search to find the next index with finish time less than equal the current jobs start time.
  Use a dp array;
- **Status:** ✅ Solved

---

### 🔹 5. Minimum Refueling Stops

- **Problem Link:** [Minimum Number of Refueling Stops – LeetCode](https://leetcode.com/problems/minimum-number-of-refueling-stops/)
- **Approach Summary:**  
  Use a max-heap to store fuel capacities of stations passed. Whenever fuel runs low, refuel using the station with the most stored fuel to minimize the number of stops.
- **Status:** ✅ Solved

### 🔹 6. Find the Minimum Number of Fibonacci Numbers Whose Sum Is K

- **Problem Link:** [Find the Minimum Number of Fibonacci Numbers Whose Sum Is K – LeetCode](https://leetcode.com/problems/find-the-minimum-number-of-fibonacci-numbers-whose-sum-is-k/description/)
- **Approach Summary:**  
  First of all add all the fibonacci numbers upto k in a list then apply the coin change approach for a greedy solution
- **Status:** ✅ Solved

### 🔹 7. Buy Two Chocolates
- **Problem Link:** [Buy Two Chocolates – LeetCode](https://leetcode.com/problems/buy-two-chocolates/description/)
- **Approach Summary:**  
  Sort the array and check for the first 2 choclates if possible then return subtraaction otherwise return the money
- **Status:** ✅ Solved


### 🔹 8. Array Partition
- **Problem Link:** [Array Partition – LeetCode](https://leetcode.com/problems/array-partition/description/)
- **Approach Summary:**  
  Sort the array and add all even indices
- **Status:** ✅ Solved
