public class MissingNumberinArray {

    public static void main(String[] args){

        //Array should not have duplicates

        int a[] = {1,2,4,5};

        //1+2+4+5 = 12 Sum1
        //1+2+3+4+5 = 15 Sum2
        //Sum2-Sum1 = 15-12 = 3 Missing

        int sum1 = 0;
        for(int i=0;i<a.length;i++)
        {
            sum1=sum1+a[i];
        }
        System.out.println("Sum of elements in array:"+ sum1);
    }
}