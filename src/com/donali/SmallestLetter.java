package com.donali;

import static com.donali.Ceiling.ceiling;

public class SmallestLetter {
    public static void main(String[] args) {
        int[] arr = {'c','v','b','n','m','s','r','t'};
        int target = 'v';
        int ans = ceiling(arr, target);
        System.out.println(ans);
    }
    public char nextGreatestLetter(char[] letters, char target) {

        int start = 0;
        int end = letters.length - 1;

        while(start <= end) {
            // find the middle element
            //int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
            int mid = start + (end - start) / 2;

            if (target < letters[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return letters[start % letters.length];
    }
}
