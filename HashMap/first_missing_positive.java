// Given an unsorted integer array nums, return the smallest missing positive integer.

// You must implement an algorithm that runs in O(n) time and uses O(1) auxiliary space
class Solution {
      public int firstMissingPositive(int[] nums) {
            int n = nums.length;

            // Perform cyclic sort to move each positive integer to its correct position
            for (int i = 0; i < n; i++) {
                  while (nums[i] > 0 && nums[i] <= n && nums[nums[i] - 1] != nums[i]) {
                        // Swap nums[i] with the element at its correct position
                        int temp = nums[i];
                        nums[i] = nums[temp - 1];
                        nums[temp - 1] = temp;
                  }
            }

            // Find the first missing positive integer
            for (int i = 0; i < n; i++) {
                  if (nums[i] != i + 1) {
                        return i + 1;
                  }
            }

            // If all positive integers from 1 to n are present, return n + 1
            return n + 1;
      }
}
