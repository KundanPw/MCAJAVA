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
    

    public static void main(String[] ars) {
        int arr[] = {10, 70, 89, 40, 5};

        // ArrayList<Integer> res = alternatePrintArray(arr);
        // for(int a: res) {
        //     System.out.print(a+" ");
        // }

        System.out.println(secondLargestElement(arr));

    }
}
