public class Hamming {
    public static <T> Integer compute(String dnaStrand, String otherStrand) {
        if (dnaStrand.equals(otherStrand)) return 0;

        return 1;
    }
}
