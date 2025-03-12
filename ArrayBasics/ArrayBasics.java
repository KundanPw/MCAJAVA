package ArrayBasics;

import java.util.Scanner;

public class ArrayBasics {
    public static void updateList(int marks[]) {
        for(int i=0; i<marks.length; i++) {
            marks[i] = marks[i] + 1;
        }
    }
    public static void main(String[] args) {

        // int marks[] = new int[50];
        // Scanner sc= new Scanner(System.in);
        // marks[0] = sc.nextInt(); // phy
        // marks[1] = sc.nextInt(); // math
        // marks[2] = sc.nextInt(); // chem

        // System.out.println("Phy: "+marks[0]);
        // System.out.println("Math: "+marks[1]);
        // System.out.println("Chem: "+marks[2]);

        // marks[2] = 100;
        // System.out.println("Che: "+marks[2]);

        // int per = (marks[0]+marks[1]+marks[2])/3;
        // System.out.println("Percentage = "+per+"%");


        int marks[] = {97, 98, 99};
        updateList(marks);

        for(int i=0; i<marks.length; i++) {
            System.out.print(marks[i]+" ");
        }
        System.out.println();
    }
}
