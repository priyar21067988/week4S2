# week4S2
# Advanced Array & Search Problems
### 1. Product of Array Except Self
Given an array, return a new array where each position holds the product of all other elements — without using division. Solved in O(n) time with two passes: a forward pass building running prefix products, and a backward pass multiplying in running suffix products.

### 2. Maximum Subarray
Given an array that may contain negative numbers, find the contiguous subarray with the largest possible sum. Solved using Kadane's algorithm — at each element, deciding whether to extend the current running subarray or restart fresh, in a single O(n) pass. Also covers the O(n log n) divide-and-conquer alternative.

### 3. 3Sum
Given an array, find all unique triplets of values that sum to exactly zero. Solved by sorting the array first, then using the two-pointer technique for each fixed first element — with careful duplicate-skipping at every level to ensure no triplet is reported more than once.

### 4. Subarray Sum Equals K
Given an array (which may include negative numbers) and a target k, count how many contiguous subarrays sum to exactly k. Solved using running prefix sums combined with a hash map of prefix-sum frequencies, achieving O(n) time — and demonstrating why a sliding window fails once negative numbers are involved.

### 5. Find Minimum in Rotated Sorted Array
Given a sorted array that has been rotated at an unknown pivot, find the minimum element. Solved using a modified binary search that compares the middle element to the rightmost element at each step to determine which half contains the minimum, achieving O(log n) time.

## Concepts Covered
- Prefix and suffix product/sum techniques
- Kadane's algorithm (extend-vs-restart decision logic)
- Two-pointer technique on sorted arrays with duplicate handling
- Hash map frequency counting for subarray sum problems
- Binary search adapted to rotated (partially sorted) arrays
- Recognizing when sliding-window techniques do and don't apply

## How to Run
Each problem is implemented as a standalone `Solution` class with a `main` method demonstrating sample inputs and expected outputs. Compile and run individually:

```bash
javac Solution.java
java Solution
```

## Requirements
- Java JDK 8 or higher

