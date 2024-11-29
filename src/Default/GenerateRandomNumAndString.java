package Default;

import java.util.Random;

public class GenerateRandomNumAndString {

    public static void main(String[] args){

        //Appraoch1 - Random

        Random rand=new Random();

        int rand_int=rand.nextInt(100);
        System.out.println(rand_int);
    }
}
