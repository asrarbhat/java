class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fibonacciIterative(8));
    }

    static long fibonacciIterative(int IntegerInput) {
        if (IntegerInput < 0)
            return -1;
        long m = 0, n = 1;
        for (int i = 0; i < IntegerInput; i++) {
            long temp = m;
            m = n;
            n += temp;
        }
        return m;
    }
}