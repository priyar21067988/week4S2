import java.util.HashMap;
import java.util.Map;

public class Solution {

    public static int subarraySum(int[] nums, int k) {
        // Maps a prefix sum value -> how many times it has occurred so far
        Map<Integer, Integer> prefixSumCounts = new HashMap<>();
        prefixSumCounts.put(0, 1); // empty prefix (sum = 0) occurs once, before we start

        int currentSum = 0;
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            currentSum += nums[i];

            // If (currentSum - k) has been seen before, each occurrence marks
            // the start of a subarray ending here that sums to exactly k
            if (prefixSumCounts.containsKey(currentSum - k)) {
                count += prefixSumCounts.get(currentSum - k);
            }

            // Record this prefix sum for future indices to check against
            prefixSumCounts.put(currentSum, prefixSumCounts.getOrDefault(currentSum, 0) + 1);
        }

        return count;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 1, 1};
        System.out.println(subarraySum(nums1, 2)); // 2

        int[] nums2 = {1, -1, 0};
        System.out.println(subarraySum(nums2, 0)); // 3
    }
}
