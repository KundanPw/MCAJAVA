
 class SearchingArray {
    public static int linearSearch(int num[], int key) {
        for(int i=0; i<num.length; i++) {
            if(num[i]==key) {
                return i;
            }
        }
        return-1;
    }

    public static void main(String[] args) {

        int number[] = {4, 8, 6, 11, 14, 16};
        int key = 11;
        int idx = linearSearch(number, key);
        if(idx==-1) {
           System.out.println("Not found");
        } else {
            System.out.println(key+" is found at "+idx);
        }
    }
    
}
