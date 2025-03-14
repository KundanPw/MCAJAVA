import java.util.HashSet;

public class ArrayProblemPart2 {
    /**
     * Given an integer array nums, return true if any value appears at least twice in the array,
     * and return flase if every element is distinct.
     */

    /* 
    public static boolean containDuplicate(int number[]) {  // Approach1-Using set TC: O(n2)
        for(int i=0; i<number.length-1; i++) {
            for(int j=i+1; j<number.length; j++) {
                if(number[i]==number[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    */

    public static boolean containDuplicate(int number[]) {   // Approach2-Using set TC: O(n)
        HashSet<Integer> set = new HashSet<>();
        for(int i=0; i<number.length; i++) {
            if(set.contains(number[i])) {
                return true;
            } else {
                set.add(number[i]);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int number[] = {1, 2, 3, 1};
        System.out.println(containDuplicate(number));
    }
}
