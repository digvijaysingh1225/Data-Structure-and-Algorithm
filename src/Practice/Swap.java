package Practice;

import java.util.Scanner;

public class Swap {
    Swap(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter 1st value : ");
        int value1 = s.nextInt();
        System.out.println("Enter 1st value : ");
        int value2 = s.nextInt();


        System.out.println("Value 1 : " + value1);
        System.out.println("Value 2 : " + value2);

        int temp = value1;
        value1 = value2;
        value2 = temp;

        System.out.println("\n-----After Swapping-----\n");
        System.out.println("Value 1 : "+value1);
        System.out.println("Value 2 : "+value2);
    }

    public static void main(String[] args) {
        Swap obj = new Swap();
    }
}
