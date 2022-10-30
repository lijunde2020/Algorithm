package com.example.algorithm.sort;

import java.util.Arrays;

public class 选择排序 {

    private static void selectionSort(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            int minIndex = i;
            for (int j = i; j < nums.length; j++) {
                if (nums[j] < nums[minIndex]) {
                    minIndex = j;
                }
            }
            swap(nums, minIndex, i);

        }
    }
    private static void swap(int[] nums, int i, int j) {
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }

    public static void main(String[] args) {
        int[] nums={1,25,3,4,3,5,45,65,6};
        selectionSort(nums);
        System.out.println(Arrays.toString(nums));
    }
}
