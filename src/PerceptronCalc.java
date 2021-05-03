import java.util.ArrayList;

public class PerceptronCalc {
    public static void main(String[] args) {

        ArrayList<Integer> patterns = new ArrayList<Integer>();
        patterns.add(001);
        patterns.add(110);


        alg(patterns, 15,20,15,22,5);

    }


    public static void alg(ArrayList<Integer> patterns, int w1, int w2, int w3, int threshold, int learningRate) {

        System.out.println("test");
    }
}
