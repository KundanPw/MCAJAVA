
 class SearchingArray {
    public static int linearSearch(int num[], int key) {
        for(int i=0; i<num.length; i++) {
            if(num[i]==key) {
                return i;
            }
        }
        return-1;
    }

    public static int binarySearch(int num[], int key) {
        int start = 0;
        int end = num.length-1;
        while (start <= end) {
            int mid = (start+end)/2;
            if(num[mid]==key) {
                return mid;
            }

            // right part
            if(num[mid] < key) {
                start = mid+1;
            } else {
                end = mid-1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        int number[] = {4, 8, 6, 11, 14, 16};
        int key = 11;

        // int idx = linearSearch(number, key);
        int idx = binarySearch(number, key);

        if(idx==-1) {
           System.out.println("Not found");
        } else {
            System.out.println(key+" is found at "+idx);
        }
    }
    
}
