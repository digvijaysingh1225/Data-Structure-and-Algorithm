package Recursion;
//Parametrized Recursion
public class sumOfnumbers
{
    public static void main(String[] args) {
//        int i=5;
//        int sum=0;
        funct(5,0);
    }

    public static void funct(int i,int sum){
        if(i<0)
        {
            System.out.println(sum);
            return;
        }
        funct(i-1,sum+i);
    }
}
