import java.util.List;

public class ArrayInterview1 {
    public static int maxConsecutiveCount(int[] arr) {  

        // Q1. Given an array arr[] consisting of only 0's and 1's, the task is to find the count of a maximum number of 
        //consecutive 1's or 0's present in the array

        int maxCount = 0, count = 1;

        for(int i=1; i < arr.length; i++) {
            if(arr[i]==arr[i-1]) {
                count++;
            } else {
                maxCount = Math.max(maxCount, count);
                count=1;
            }
        }
        return Math.max(maxCount, count);
    }

    public static void pushZeroesToEnd(int arr[]) {

        // Q2. Given an array of integers arr[], the task is to move all the zeroes to the end of the array while maintaining the relative order of all non-zero elements

        int n = arr.length;
        int temp[] = new int[n];
        
        int j=0; // To keep track of the index in temp[]

        for(int i=0; i<n; i++) { // copy nonzero to temp[]
            if(arr[i] != 0) {
                temp[j++] = arr[i];
            }
        }

        while (j<n) {  // rest of index fill with zeroes to temp[]
            temp[j++] = 0;
        }

        for(int i=0; i<n; i++) { // copy all the element to arr[]
            arr[i] = temp[i];
        }

    }

    public static void reverseInGroups(int num[], int k) {

        // Q3. Given an array arr[] and an integer k, the task is to reverse every subarray formed by consecutive K elements Ex: arr[]=[1, 2, 3, 4, 5, 6, 7, 8, 9], k=3 the output: 3, 2, 1, 6, 5, 4, 8, 7
        int n = num.length;
        for(int i=0; i<n; i+=k) {
            int left = i;
            int right = Math.min(i+k-1, n-1);

            // Reverse the sub-array
            while(left<right) {
                int temp = num[left];
                num[left] = num[right];
                num[right] = temp;
                left++;
                right--;
            }
        }
    }

    public static void printArray(int arr[]) {
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        // int[] arr = {1, 1, 0, 0, 1, 0, 1, 0, 1, 1, 1, 1};
        // System.out.println(maxConsecutiveCount(arr));

        //int[] num = {0, 5, 0, 3, 4, 0, 2, 1};
        // pushZeroesToEnd(num);
        
        int[] num = {1, 2, 3, 4, 5, 6, 7, 8};
        printArray(num);
        reverseInGroups(num, 3);
        printArray(num);
    }
}