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

        int arr[] = {16, 17, 4, 3, 5, 2};

        ArrayList<Integer> result = leaderElement(arr);
        for(int a:result) {
            System.out.print(a+" ");
        }
    }
}
