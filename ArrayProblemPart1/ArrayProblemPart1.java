public class ArrayProblemPart1 {
   
    public static int largestNumber(int number[]) {   //Q1. Find the largest number in a given array
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        for(int i=0; i<number.length; i++) {
            if(largest < number[i]) {
                largest = number[i];
            }

            if(smallest > number[i]) {
                smallest = number[i];
            }
        }

        System.out.println("Smallest number is "+smallest);
        return largest;
    }

    public static void reverseArray(int number[]) {
        int first = 0, last = number.length-1;
        while(first < last) {
            int temp = number[last];
            number[last] = number[first];
            number[first] = temp;
            first++;
            last--;
        }
    }


    public static void printArray(int number[]) {
        for(int i=0; i<number.length; i++) {
            System.out.print(number[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        // int num[] = {4, 9, 2, 10, 8, 5};
        // int largest = largestNumber(num);
        // System.out.println("Largest number is "+largest);

        int num[] = {2, 5, 9, 10, 12};
        printArray(num);
        reverseArray(num);
        printArray(num);
    }
}
