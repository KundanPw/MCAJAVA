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

    public static void reverseArray(int number[]) {  //Q2. Find the reverse of array
        int first = 0, last = number.length-1;
        while(first < last) {
            int temp = number[last];
            number[last] = number[first];
            number[first] = temp;
            first++;
            last--;
        }
    }

    public static void pairsArray(int number[]) {  // Q3. Find the pairs in array
        for(int i=0; i<number.length; i++) {
            int curr = number[i];
            for(int j=i+1; j<number.length; j++) {
                System.out.print("("+curr+","+number[j]+") ");
            }
            System.out.println();
        }
    }

    public static void printSubArray(int number[]) { // Q4. Print Subarray
        int tp=0; // Find total pairs of Sub Array
        for(int i=0; i<number.length; i++) {
            int start=i;
            for(int j=i; j<number.length; j++) {
                int end=j;
                for(int k=start; k<=end; k++) {
                    System.out.print(number[k]+" ");
                }
                tp++;
                System.out.println();
            }
        }
        System.out.println("Total pairs is "+tp);
    }

    public static void maxSubArraySum(int number[]) { // Q5. Find max subarray sum using Bruete force
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i=0; i<number.length; i++) {
            int start=i;
            for(int j=i; j<number.length; j++) {
                int end=j;
                currSum=0;
                for(int k=start; k<=end; k++) {
                    currSum += number[k];
                }
                System.out.println(currSum);
                if(maxSum<currSum) {
                    maxSum = currSum;
                }
            }
        }
        System.out.println("Max sum is "+maxSum);

    }

    public static void maxSubArraySumPrefixSum(int number[]) { //Q5. Find max subarray sum using prefix sum
        int currSum=0;
        int maxSum=Integer.MIN_VALUE;
        int prefix[]=new int[number.length];
        prefix[0]=number[0];
        // calculate prefix array
        for(int i=1; i<prefix.length; i++) {
            prefix[i] = prefix[i-1]+number[i];
        }

        for(int i=0; i<number.length; i++) {
            int start=i;
            for(int j=i; j<number.length; j++) {
                int end=j;
               currSum = start==0?prefix[end] : prefix[end] - prefix[start-1];
            }
            if(maxSum<currSum) {
                maxSum = currSum;
            }
        }
        System.out.println("Max sum is "+maxSum);

    }

    public static void maxSubArraySumKADANES(int number[]) {
        int ms = Integer.MIN_VALUE;
        int cs = 0;
        for(int i=0; i<number.length; i++) {
            cs = cs+number[i];
            if(cs<0) {
                cs=0;
            }
            ms = Math.max(cs, ms);
        }
        System.out.println("Max sum is "+ms);
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

        int num[] = {2, 4, 6, 8, 10};
        //printArray(num);
        //reverseArray(num);
        //printArray(num);

        // pairsArray(num);
        // printSubArray(num);
        // maxSubArraySum(num);
        // maxSubArraySumPrefixSum(num);
        maxSubArraySumKADANES(num);
    }
}
