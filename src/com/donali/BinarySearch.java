package com.donali;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {-9,-3,2,4,6,7,8,9, 15,18,19,45,89};
        int target = 19;
        int ans = binarySearch(arr, target);
        System.out.println(ans);
    }
    //return the index
    //return -1 if it does not exist
    static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            //find the middle element
            //int mid = (start + end) / 2;  //might be possible that (start + end) exceeds the range of integer in java
            int mid = start + (end - start) / 2;

            if(target < arr[mid]){
                end = mid - 1;
            }else if(target > arr[mid]){
                start = mid + 1;
            }else{
                //ans found
                return mid;
            }
        }
        return -1;
    }
}
