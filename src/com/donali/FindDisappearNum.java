package com.donali;

import java.util.ArrayList;
import java.util.List;

class FindDisappearNum {
    public static void main(String[] args) {
        int[] arr = {4, 3, 2,7, 8, 2, 3, 1};
        FindDisappearNum obj = new FindDisappearNum();
        System.out.println(obj.FindDisappearNumber(arr));
    }

    public List<Integer> FindDisappearNumber(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correct = nums[i];
            if (nums[i] < nums.length && nums[i] != nums[correct]) {
                swap(nums, i, correct);
            } else {
                i++;
            }
        }

        // find missing numbers
        List<Integer> ans = new ArrayList<>();
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index) {   // since numbers go from 0 to n-1
                ans.add(index);
            }
        }
        return ans;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
