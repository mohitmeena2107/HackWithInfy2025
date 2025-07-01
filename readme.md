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
  Sort jobs by profit in descending order. For each job, try to assign it to the latest available slot before its deadline to maximize total profit.
- **Status:** ✅ Solved

---

### 🔹 5. Minimum Refueling Stops

- **Problem Link:** [Minimum Number of Refueling Stops – LeetCode](https://leetcode.com/problems/minimum-number-of-refueling-stops/)
- **Approach Summary:**  
  Use a max-heap to store fuel capacities of stations passed. Whenever fuel runs low, refuel using the station with the most stored fuel to minimize the number of stops.
- **Status:** ✅ Solved
