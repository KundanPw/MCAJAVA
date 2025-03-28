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
    public static void main(String[] args) {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 0, 1, 1, 1, 1};
        System.out.println(maxConsecutiveCount(arr));
    }
}