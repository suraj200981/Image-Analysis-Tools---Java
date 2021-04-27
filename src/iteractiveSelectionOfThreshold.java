import java.util.Random;

public class iteractiveSelectionOfThreshold {
    public static void main(String[] args) {
        int[] greyLevels = new int[16];
        greyLevels[0] = 0;
        greyLevels[1] = 1;
        greyLevels[2] = 2;
        greyLevels[3] = 3;
        greyLevels[4] = 4;
        greyLevels[5] = 5;
        greyLevels[6] = 6;
        greyLevels[7] = 7;
        greyLevels[8] = 8;
        greyLevels[9] = 9;
        greyLevels[10] = 10;
        greyLevels[11] = 11;
        greyLevels[12] = 12;
        greyLevels[13] = 13;
        greyLevels[14] = 14;
        greyLevels[15] = 15;

        int[] frequency = new int[16];
        frequency[0] = 0;
        frequency[1] = 0;
        frequency[2] = 3;
        frequency[3] = 101;
        frequency[4] = 380;
        frequency[5] = 11;
        frequency[6] = 6;
        frequency[7] = 9;
        frequency[8] = 11;
        frequency[9] = 22;
        frequency[10] = 57;
        frequency[11] = 71;
        frequency[12] = 30;
        frequency[13] = 17;
        frequency[14] = 8;
        frequency[15] = 3;



        alg(greyLevels,frequency);
    }

    public static void alg(int [] greyLevels,int[] frequency){

        int threshold = getRandom(greyLevels); // might have to change this manually or create another function to figure this out
        int count =0;

        System.out.println("Step 1: Let θ-"+count+" = "+ threshold); //out of loop



        System.out.println();//loop starts here
        System.out.println();
        System.out.println("Iteration "+count+": (θ = "+threshold+")");
        System.out.println();
        System.out.println("Step 2: 0 <= g <= "+threshold+" froms R1 & g >"+threshold+" are the R2");
        System.out.println();

        System.out.print("μ1 = (" );

        int []  μ1Numerator = new int[10]; //change this to random
        int []  μ1Denominator = new int[frequency.length-1]; //change this to random


        for(int x= 0; x<=9;x++){
            μ1Numerator[x] = greyLevels[x]*frequency[x];
            System.out.print(μ1Numerator[x]+" + ");

        }
        System.out.print(") / ");
        for(int x= 0; x<=9;x++){
            μ1Denominator[x] = μ1Denominator[x]+frequency[x];
            System.out.print(μ1Denominator[x]+" + ");
        }
        System.out.print(") = ");
        double sum1 = 0;
        for(int x=0; x< μ1Numerator.length; x++){
            sum1 = sum1 +  μ1Numerator[x];
        }

        double sum2 = 0;
        for(int x=0; x< μ1Numerator.length; x++){
            sum2 = sum2 +  μ1Denominator[x];
        }
        System.out.print((double) Math.round((sum1/sum2)*100)/100);

        double firstMean = (double) Math.round((sum1/sum2)*100)/100;

    }

    public static int getRandom(int[] array) {
        int rnd = new Random().nextInt(array.length);
        return array[rnd];
    }
}
