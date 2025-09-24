package com.donali;

public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
        int[] arr = {-99,-3,2,4,16,7,81,9, 15,8,19,4,8};
        int target = 19;
        int ans = orderAgnosticBS(arr, target);
        System.out.println(ans);
    }

    static int orderAgnosticBS(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        //find whether the array is sorted is ascending or descending
        boolean isAsc = arr[start] < arr[end];

        while(start <= end){
            //find the middle element
            //int mid = (start + end) / 2;  //might be possible that (start + end) exceeds the range of integer in java
            int mid = start + (end - start) / 2;

            if(arr[mid] == target){
               return mid;
            }

            if(isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }else{
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
