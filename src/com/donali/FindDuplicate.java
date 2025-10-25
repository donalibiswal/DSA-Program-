package com.donali;

import java.util.List;

public class FindDuplicate {
    public static void main(String[] args) {
        int[] arr = {4, 4, 2,7, 8, 2, 3, 1};
        FindDuplicate obj = new FindDuplicate();
        System.out.println(obj.FindDuplicateNo(arr));
    }

    public int FindDuplicateNo(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            if(arr[i] != i +1){
                int correct = arr[i] - 1;
                if (arr[i] != arr[correct]) {
                    swap(arr, i, correct);
                } else {
                   return  arr[i];
                }
            }else{
                i++;
            }

        }
        return  -1;
    }
    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
