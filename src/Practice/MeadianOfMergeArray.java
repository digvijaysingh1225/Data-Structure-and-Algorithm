package Practice;

import java.util.Arrays;
import java.util.Scanner;

public class MeadianOfMergeArray {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int[] arr1 = new int[n1];
        int[] arr2 = new int[n2];

        for(int i=0;i<n1;i++){
            arr1[i]=sc.nextInt();
        }
        for(int j=0;j<n2;j++){
            arr2[j]=sc.nextInt();
        }

         int[] arr3 = new int[n1+n2];
         int n3=n1+n2;
        for(int i=0;i<n1;i++){
            arr3[i]+=arr1[i];
        }
        for (int i = 0; i < n2; i++) {
            arr3[i+n1]+=arr2[i];
        }

        Arrays.sort(arr3);
        System.out.println(Arrays.toString(arr3));
        if(arr3.length%2!=0){
            int start=0;
            int end=arr3.length-1;
            int mid=(end-start)/2;
            System.out.println((float) arr3[mid]);
        }
        else{
            int start=0;
            int end=arr3.length-1;
            int mid=(end-start)/2;
            double res= (double) (arr3[mid]+arr3[mid+1])/2;
            System.out.println(res);
        }
    }
}
