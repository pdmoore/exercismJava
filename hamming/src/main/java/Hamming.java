public class Hamming {
    public static <T> Integer compute(String dnaStrand, String otherStrand) {

        int differences = 0;
        for (int i = 0; i < dnaStrand.length(); i++) {
            if (dnaStrand.charAt(i) != otherStrand.charAt(i)) ++differences;
        }
        return differences;
    }
}
