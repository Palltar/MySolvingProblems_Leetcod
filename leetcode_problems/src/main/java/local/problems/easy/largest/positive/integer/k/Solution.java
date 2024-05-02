package local.problems.easy.largest.positive.integer.k;


import java.util.Arrays;
//2441
//Given an integer array nums that does not contain any zeros,
//find the largest positive integer k such that -k also exists in the array.
//Return the positive integer k. If there is no such integer, return -1.

public class Solution {
    public int findMaxK(int[] nums) {
        int res = -1;
        Arrays.sort(nums);
        int i = 0;
        int j = nums.length - 1;
        while ( i < j ){
            if (-nums[i] == nums[j]) return nums[j];
            else if (-nums[i] > nums[j]) i++;
            else j--;
        }
        return -1;
    }
}

