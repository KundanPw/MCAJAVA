import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;

public class ArrayProblemPart2 {
    /**
     * Given an integer array nums, return true if any value appears at least twice in the array,
     * and return flase if every element is distinct.
     */

    /* 
    public static boolean containDuplicate(int number[]) {  // Approach1-Using set TC: O(n2)
        for(int i=0; i<number.length-1; i++) {
            for(int j=i+1; j<number.length; j++) {
                if(number[i]==number[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    */

    public static boolean containDuplicate(int number[]) {   // Approach2-Using set TC: O(n)
        HashSet<Integer> set = new HashSet<>();
        for(int i=0; i<number.length; i++) {
            if(set.contains(number[i])) {
                return true;
            } else {
                set.add(number[i]);
            }
        }
        return false;
    }

    /*
     Q2. There is an integer array nums sorted in ascending order(with distinct values). Prior to being passed to your function, 
     nums is possibly rotated at an unknown pivot index k(1 <= k<nums.length) such that the resulting array is [num[k],
     nums[k+1],....,nums[n-1], num[0], nums[1],...,nums[k-1]] (0-indexed). for example, [0, 1, 2, 4, 5, 6, 7] might be 
     rotated at pivot index3 and become[4, 5, 6, 7, 0, 1 2]. Given the array nums after the possible rotation and an integer 
     target, return the index of target if it is in nums, or -1 if it is not in nums. you mus write an algorithm with O(log n) 
     runtime complexity
     */
    public static int searchAfterRotation(int nums[], int target) {

        int left = 0, right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Check if target is found
            if (nums[mid] == target) {
                return mid;
            }

            // Determine which part of the array is sorted
            if (nums[left] <= nums[mid]) { // Left part is sorted
                if (nums[left] <= target && target < nums[mid]) {
                    right = mid - 1; // Target is in the left part
                } else {
                    left = mid + 1;  // Target is in the right part
                }
            } else { // Right part is sorted
                if (nums[mid] < target && target <= nums[right]) {
                    left = mid + 1; // Target is in the right part
                } else {
                    right = mid - 1; // Target is in the left part
                }
            }
        }

        // Target not found
        return -1;
    }

    /**
    Q2. Given a integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i!=j, i!=k, and j!=k, and nums[i]+nums[j]+nums[k]==0. 
     Notice that the solution set must not contain duplicate triplets. Example input: nums=[-1, 0, 1, 2, -1, -4] and output: [[-1, -1, 2], [-1, 0, 1]].
     */
    public List<List<Integer>> threeSum(int nums[]) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();

        for(int i=0; i<nums.length; i++) {
            for(int j=i+1; j<nums.length; j++) {
                for(int k=j+1; k<nums.length; k++) {
                    if(nums[i] + nums[j] + nums[k] == 0) {
                        List<Integer> triplet = new ArrayList<Integer>();
                        triplet.add(nums[i]);
                        triplet.add(nums[j]);
                        triplet.add(nums[k]);

                        Collections.sort(triplet);
                        result.add(triplet);
                    }
                }
            }
        }
        result = new ArrayList<List<Integer>> (new LinkedHashSet<List<Integer>>(result));
        return result;
    }


    public static void main(String[] args) {

        // int number[] = {1, 2, 3, 1};
        // System.out.println(containDuplicate(number));

        //int number[] = {4, 5, 6, 7, 0, 1, 2};
       // System.out.println( searchAfterRotation(number, 0));

       ArrayProblemPart2 obj = new ArrayProblemPart2();
       int[] nums = {-1, 0, 1, 2, -1, -4};
       List<List<Integer>> triplet = obj.threeSum(nums);
       System.out.println(triplet);
    }
}
