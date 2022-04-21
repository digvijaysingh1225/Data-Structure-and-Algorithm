package Practice;

public class Arrayfirstprogram {
    void func(){
        int arr[] = {1,2,3,4,5,6};
        System.out.println("----Array Elements----");
        for(int i=0;i< arr.length;i++){
            System.out.println(arr[i]);
        }
        System.out.println("No. of elements in arrray : "+arr.length);
    }

    public static void main(String[] args) {
        Arrayfirstprogram obj = new Arrayfirstprogram();
        obj.func();
    }
}
