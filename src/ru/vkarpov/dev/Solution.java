package ru.vkarpov.dev;

import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        int[] array = new int[]{5, 4, 3, 2, 1, 0};
        System.out.println(Arrays.toString(array));
        int[] sortArray = bubbleSort(array);
    }

    public static int[] bubbleSort(int[] array){
        int tmp = 0;
        int count = array.length;
        while ( count > 1){
            for (int i = 1; i < array.length; i++) {
                if (array[i - 1] > array[i]){
                    tmp = array[i - 1];
                    array[i - 1] = array [i];
                    array [i] = tmp;
                }
            }
            count--;
            System.out.println(Arrays.toString(array));
        }
        return array;
    }

}
