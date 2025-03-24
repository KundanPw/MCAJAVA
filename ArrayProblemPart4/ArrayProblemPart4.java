import java.util.*;

public class ArrayProblemPart4 {
    static ArrayList<Integer> alternatePrintArray(int arr[]) { // Q1. Print alternate elements of an array
        ArrayList<Integer> res = new ArrayList<>();
        for(int i=0; i<arr.length; i+=2) {
            res.add(arr[i]);
        }
        return res;
    }

    

    public static void main(String[] ars) {
        int arr[] = {10, 20, 30, 40, 50};
        ArrayList<Integer> res = alternatePrintArray(arr);
        for(int a: res) {
            System.out.print(a+" ");
        }
    }
}
