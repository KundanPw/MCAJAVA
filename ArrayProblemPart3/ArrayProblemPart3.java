
public class ArrayProblemPart3 {
    public static void insertElementAtFirstIndex(int arr[], int value) { // Q1. Insert element at first index using array

        int[] newArr = new int[arr.length+1];
        newArr[0] = value;
        for(int i=0; i<arr.length; i++) {
            newArr[i+1] = arr[i];
        }

        for(int i=0; i<newArr.length; i++) {
            System.out.print(newArr[i]+" ");
        }
    }

    public static void insertElementAtEndIndex(int arr[], int value) {  // Q2. Insert element at last index using array
        
        int[] newArr = new int[arr.length+1];
        newArr[arr.length] = value;
        for(int i=0; i<arr.length; i++) {
            newArr[i] = arr[i];
        }

        for(int i=0; i<newArr.length; i++) {
            System.out.print(newArr[i]+" ");
        }
    }

    public static void insertElementAtSpecificIndex(int arr[], int value, int position) { // Q3. Insert element at specific index using array
        int[] newArr = new int[arr.length+1];

        for(int i=0; i<position; i++) {
            newArr[i] = arr[i];
        }

        newArr[position] = value;
        for(int i=position; i<arr.length; i++) {
            newArr[i+1] = arr[i];
        }

        for(int i=0; i<newArr.length; i++) {
            System.out.print(newArr[i]+" ");
        }

    }

    public static void main(String[] args) {
        int arr[] = {3, 9, 8, 1};
        // insertElementAtFirstIndex(arr, 2);
        // insertElementAtEndIndex(arr, 2);
        insertElementAtSpecificIndex(arr, 4, 1);
    }
}
