# Closest-Pair-Sum-to-Target
The "Two Sum Closest Problem" requires finding a pair of numbers in a sorted array whose sum is closest to a given target. This problem is widely used to practice the two-pointer approach for efficient solving.
Problem Statement:
Given a sorted array of integers arr and a target integer target, find the pair of numbers whose sum is closest to the target. Return the pair of numbers.

Example Input:

makefile
arr = [-1, 2, 4, 6, 8]  
target = 5  

Example Output:
Output: [2, 4]  
Explanation: The pair -1 and 6 has a sum of 5, which is closest to the target 5.

How it works:

Use two pointers (left and right) starting from opposite ends of the array.
Calculate the sum of the pair pointed by the two pointers.
Track the pair with the closest sum to the target.
Adjust the pointers:
If the sum is less than the target, increment left to increase the sum.
If the sum is greater than the target, decrement right to decrease the sum.
Continue until the pointers meet.

Time Complexity: O(n)
Space Complexity: O(1)
