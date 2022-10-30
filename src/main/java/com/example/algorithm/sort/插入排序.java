package com.example.algorithm.sort;

import java.util.Arrays;

public class 插入排序 {

    private static void insertionSort(int[] nums) {
        for (int i = 1,j; i < nums.length; ++i) {
            int num = nums[i];
            for (j = i - 1; j >= 0 && nums[j] > num; --j) {
                nums[j + 1] = nums[j];
            }
            nums[j + 1] = num;


        }
    }

    public static void main(String[] args) {
        int[] nums={1,25,3,4,3,5,45,65,6};
        insertionSort(nums);
        System.out.println(Arrays.toString(nums));
    }
}
