public class IsPrime {
    public static void main(String[] args) {
        System.out.println(isPrime(12));
    }

    static boolean isPrime(long positiveNumber) {
        if (positiveNumber == 2)
            return true;
        if (positiveNumber < 2 || positiveNumber % 2 == 0)
            return false;
        long biggestPotentialFactor = (long) Math.sqrt(positiveNumber);
        for (long factor = 3; factor <= biggestPotentialFactor; factor += 2) {
            if (positiveNumber % factor == 0)
                return false;
        }
        return true;
    }
}
