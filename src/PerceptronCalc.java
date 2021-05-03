import java.util.ArrayList;

public class PerceptronCalc {
    public static void main(String[] args) {

        ArrayList<String> patterns = new ArrayList<String>();
        patterns.add("001");
        patterns.add("110");


        alg(patterns, 15, 20, 15, 22, 5);

    }


    public static void alg(ArrayList<String> patterns, int w1, int w2, int w3, int threshold, int learningRate) {

        System.out.println(getSummation(patterns, w1, w2, w3));

    }

    public static int newWeightForumla(int t, int o, int n) {
        int firstPart = t - o;
        int secondPart = firstPart;
        return (t - o);
    }

    public static int getSummation(ArrayList<String> patterns, int w1, int w2, int w3) {
        ArrayList<Integer> weightsList = new ArrayList<Integer>();
        weightsList.add(w1);
        weightsList.add(w2);
        weightsList.add(w3);

        String s1 = patterns.get(0);
        String s2 = patterns.get(1);

        int sum = 0;

        for (int x = 0; x<s1.length(); x++) {
            char tempChar = s1.charAt(x);
            int tempInt=Integer.parseInt(String.valueOf(tempChar));

            sum+= weightsList.get(x)*tempInt;
        }
        return sum;

    }

}

