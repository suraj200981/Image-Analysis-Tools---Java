public class BiometricErrorCalculator {
    public static void main(String[] args) {

        System.out.println("Forumulas:");
        System.out.println();
        System.out.println();
        System.out.println("False Acceptance Rate (FAR): " + " imposters accepted/(imposters accepted + impostors rejected)");
        System.out.println();
        System.out.println("False Rejection Rate (FRR): " + " genuines rejected/(genuines rejected+ genuines accepted)");
        System.out.println();
        System.out.println();
        System.out.println();

        errorRateCalculations(4679, 389, 101, 31751);

    }


    public static void errorRateCalculations(int genuineAccept, int falseRejection, int falseAccept, int trueReject) {
        double FARresult = (double) falseAccept / (falseAccept + trueReject);
        double FRRresult = (double) falseRejection / (falseRejection + genuineAccept);
        double accuracy = (double) (genuineAccept+trueReject)/(genuineAccept+falseRejection+falseAccept+trueReject);
        System.out.println("Remember to round the percentage yourself if you wish i.e. 7.675611681136544% becomes 7.7%");
        System.out.println();
        System.out.println();
        System.out.print("FAR : " + falseAccept + "/(" + falseAccept + " + " + trueReject + ") = " + FARresult);
        System.out.print("       Rounded up and as a percentage= " + FARresult * 100 + "%");
        System.out.println();
        System.out.println();
        System.out.print("FAR : " + falseRejection + "/(" + falseRejection + " + " + genuineAccept + ") = " + FRRresult);
        System.out.print("       Rounded up and as a percentage= " + FRRresult * 100 + "%");
        System.out.println();
        System.out.println();
        System.out.print("Accuracy of this system : " + "(" + genuineAccept + "+" + trueReject + ")/(" + genuineAccept + "+" + falseRejection + "+" + falseAccept + "+" + trueReject + ") = " +accuracy);
        System.out.print("       Rounded up and as a percentage= " + accuracy * 100 + "%");

    }
}
