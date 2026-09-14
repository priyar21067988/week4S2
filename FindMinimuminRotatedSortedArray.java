public class Solution {

    public static int findMin(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] > nums[right]) {
                // Minimum must be to the right of mid (the "break" happens somewhere after mid)
                left = mid + 1;
            } else {
                // nums[mid] <= nums[right] means the right half (including mid) is already sorted,
                // so the minimum is either mid itself or somewhere to its left
                right = mid;
            }
        }

        // left == right, pointing at the minimum element
        return nums[left];
    }

    public static void main(String[] args) {
        int[] nums1 = {3, 4, 5, 1, 2};
        System.out.println(findMin(nums1)); // 1

        int[] nums2 = {4, 5, 6, 7, 0, 1, 2};
        System.out.println(findMin(nums2)); // 0

        int[] nums3 = {11, 13, 15, 17};
        System.out.println(findMin(nums3)); // 11
    }
}
