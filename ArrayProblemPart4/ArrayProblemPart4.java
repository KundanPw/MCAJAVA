import java.util.*;

public class ArrayProblemPart4 {
    static ArrayList<Integer> alternatePrintArray(int arr[]) { // Q1. Print alternate elements of an array
        ArrayList<Integer> res = new ArrayList<>();
        for(int i=0; i<arr.length; i+=2) {
            res.add(arr[i]);
        }
        return res;
    }

    public static int secondLargestElement(int arr[]) {  // Q2. Findout the second largest element in the given array
        int largest = -1, secondLargest = -1;
        for(int i=0; i<arr.length; i++) {
            if(largest < arr[i]) {
                secondLargest = largest;
                largest = arr[i];
            } else if(arr[i] < largest && arr[i] > secondLargest) {
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }

    public static List<Integer> getThreeLargestElement(int arr[]) { // Q3. Findout the three largest number from array

        int fst = Integer.MIN_VALUE, sec = Integer.MIN_VALUE,  trd = Integer.MIN_VALUE;

        for(int a:arr) {
            if(fst < a) {
                trd = sec;
                sec = fst;
                fst = a;
            } else if(sec < a && fst != a) {
                trd = sec;
                sec = a;
            } else if(trd < a && fst != a && sec != a) {
                trd = a;
            }
        }

        List<Integer> res = new ArrayList<>();
        if(fst == Integer.MIN_VALUE) return res;
        res.add(fst);
        if(sec == Integer.MIN_VALUE) return res;
        res.add(sec);
        if(trd == Integer.MIN_VALUE) return res;
        res.add(trd);

        return res;
    }

    // Q4. Given an array arr[] of size n, the task is to find all the leaders in the array. An element is a leader if it is greater than or equal to all the elements to its right side: Exm: arr[] = [16, 17, 4, 3, 5, 2] and output = [17, 5, 2]

    static ArrayList<Integer> leaderElement(int arr[]) {
        ArrayList<Integer> res = new ArrayList<>();
        int n = arr.length;
        for(int i=0; i<n; i++) {
            int j;
            for(j=i+1; j<n; j++) {
                if(arr[i] < arr[j]) { // find largest element
                    break;
                }
            }

            if(j==n) { // no found largest element
                res.add(arr[i]);
            }
        }

        return res;
    }

    static boolean isSortedArray(int arr[]) { // Q5 Check given array is sorted if not sorted then it return false or otherwise it return true on sorted
        int n = arr.length;
        if(n==0||n==1) {
            return true;
        }

        for(int i=1; i<n; i++) {
            if(arr[i-1] > arr[i]) { // unsorted pair found
                return false;
            }
        }

        // no unsroted pair found
        return true;
    }

    static int removeDuplicates(int arr[]) { // Q6. Given a sorted array arr[] of size n, the goal is to rearrange the array so that all distinct elements appear at the beginning is sorted order. Additionally, return the length of this distinct sorted subarray
        int n=arr.length;
        if(n<=1) {
            return n;
        }

        int idx = 1;
        for(int i=1; i<n; i++) {
            if(arr[i]!=arr[i-1]) {
                arr[idx++] = arr[i];
            }
        }
        return idx;
    }
    

    public static void main(String[] ars) {
        //int arr[] = {10, 70, 89, 40, 5};

        // ArrayList<Integer> res = alternatePrintArray(arr);
        // for(int a: res) {
        //     System.out.print(a+" ");
        // }

        // System.out.println(secondLargestElement(arr));

        // List<Integer> res = getThreeLargestElement(arr);
        // for(int a: res) {
        //     System.out.print(a+" ");
        // }

        // int arr[] = {16, 17, 4, 3, 5, 2};

        // ArrayList<Integer> result = leaderElement(arr);
        // for(int a:result) {
        //     System.out.print(a+" ");
        // }

        // int arr[] = {4, 8, 9, 10, 15};
        // if(isSortedArray(arr)) {
        //     System.out.print("Sorted array");
        // } else {
        //     System.out.print("Not sorted array");
        // }

        int arr[] = {1, 2, 2, 3, 4, 4, 4, 5, 5};
        int res = removeDuplicates(arr);
        for(int i=0; i<res; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
