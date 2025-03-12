public class ArrayProblemPart1 {
   
    public static int largestNumber(int number[]) {   // Find the largest number in a given array
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

    public static void main(String[] args) {
        int num[] = {4, 9, 2, 10, 8, 5};
        int largest = largestNumber(num);
        System.out.println("Largest number is "+largest);
    }
}
