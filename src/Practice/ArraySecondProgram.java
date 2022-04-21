package Practice;

public class ArraySecondProgram {
    ArraySecondProgram(){
        int arr[] = new int[5];
        arr[0]=10;
        arr[1]=20;
        arr[2]=30;
        arr[3]=40;
        arr[4]=50;

        System.out.println("----Array Elements----");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        ArraySecondProgram obj = new ArraySecondProgram();
    }
}
