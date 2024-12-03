package Default;

public class SumOfArray {

    public static void main(String args[]) {

        int[] a= {5,2,7,9,6};   // n=5   n-1=4

        int sum=0;

        for(int i=0; i<=a.length-1;i++)  //0 1 2 3 4 //a.length-1=4
        {
            sum=sum+a[i];  //5+1+7+9+6==29
        }

        System.out.println("Sum of Array elements:"+sum);
    }
}
