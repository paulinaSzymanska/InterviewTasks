package src.java.leetcode.medium;

/**
 * Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.
 * <p>
 * Example 1:
 * Input: nums = [1,2,3,4,5,6,7], k = 3
 * Output: [5,6,7,1,2,3,4]
 * Explanation:
 * rotate 1 steps to the right: [7,1,2,3,4,5,6]
 * rotate 2 steps to the right: [6,7,1,2,3,4,5]
 * rotate 3 steps to the right: [5,6,7,1,2,3,4]
 * <p>
 * Example 2:
 * Input: nums = [-1,-100,3,99], k = 2
 * Output: [3,99,-1,-100]
 * Explanation:
 * rotate 1 steps to the right: [99,-1,-100,3]
 * rotate 2 steps to the right: [3,99,-1,-100]
 */

import java.util.Arrays;

public class RotateArray {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int[] nums2 = {-1, -100, 3, 99};

        System.out.println(Arrays.toString(rotate(nums, 3)));
        System.out.println(Arrays.toString(rotate(nums2, 2)));
    }

    public static int[] rotate(int[] nums, int k) {
        int[] numsTemp = new int[nums.length];

        for (int i = 1; i <= k; i++) {
            int lastNum = nums[nums.length - 1];
            numsTemp[0] = lastNum;

            System.arraycopy(nums, 0, numsTemp, 1, nums.length - 1);
            nums = numsTemp.clone();
        }
        return nums;
    }
}
