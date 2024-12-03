package Default;

import java.util.Random;

public class GenerateRandomNumAndString {

    public static void main(String[] args){

        //Appraoch1 - Random

        Random rand=new Random();

        //int rand_int=rand.nextInt(100);
        //System.out.println(rand_int);

        //double rand_dbl=rand.nextDouble(); //range 0.0 and less than 1.0
        //System.out.println(rand_dbl);

        //Appraoch2 - Math
        System.out.println(Math.random());
    }
}
