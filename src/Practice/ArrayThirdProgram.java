package Practice;

public class ArrayThirdProgram {
    ArrayThirdProgram(){
        int[] arr ={10,11,12,13,14,15};
        int i=0;
        int sum=0;
        while(i<arr.length){
            System.out.println(arr[i]);
            sum+=arr[i];
            i++;
        }
        System.out.println("Sum of Array Elements : "+ sum);
        System.out.println("No. of Elements : "+ arr.length);
    }

    public static void main(String[] args) {
        ArrayThirdProgram obj = new ArrayThirdProgram();
    }
}
