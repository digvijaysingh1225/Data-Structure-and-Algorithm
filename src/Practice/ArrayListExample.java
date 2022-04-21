package Practice;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        System.out.println("Enter no. of rows : ");
        int n=in.nextInt();
        for (int i = 0; i < n; i++) {
            list.add(new ArrayList<Integer>());
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                list.get(i).add(in.nextInt());
            }

        }
        System.out.println(list);
//
//        list.add(50);
//        list.add(23);
//        list.add(45);
//        list.add(76);
//        list.add(89);
//
//        System.out.println(list);//returns all element
//        System.out.println(list.get(3));//returns the value at that index
//        System.out.println(list.contains(45));//returns true or false

    }
}
