package Default;

public class CountNum {
    public static void main (String [] args){

        int num = 1234;
        int count=0;

       /* int check =num;
        while(check >0){
            check = check/10;
            count++;

        }

        System.out.println("Count ="+count);

        */

        // 2. odd number count and even number count
        /*
        int res = 0;
        int odd_count=0;
        int even_count=0;
        while(num>0){
            res = res + num%10;
            num= num/10;

            if(res%2==0){
                even_count++;
            }else{
                odd_count++;
            }
        }
        System.out.println("odd count="+odd_count);
        System.out.println("even count="+ even_count);

         */

        // 3. Sum of given number digits

        int res=0;

        while(num>0){

            res =  num%10;
            num = num/10;
            count = count+ res;
        }

        System.out.println("Digits count =" + count);

    }
}
