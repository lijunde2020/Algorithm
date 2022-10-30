package com.example.algorithm.sort;

import java.util.Arrays;

public class 冒泡排序 {

    public static int[] bubbleSort(int[] arr,int len){
        for (int i = 0; i < len; i++) {
            for (int j = i+1; j < len ; j++) {
                if (arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr={1,324,65,76,7,786,7,67,69};
        bubbleSort(arr,arr.length);
        System.out.println(Arrays.toString(arr));
    }
}
