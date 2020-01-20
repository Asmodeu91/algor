package lesson5;

public class Main {
    public static void main(String[] args) {
//        System.out.println(fact(5));
//        System.out.println(recFact(5));
//        System.out.println(fibo(47));
//        System.out.println(recFibo(10));
//        System.out.println(triangleNum(5));
//        System.out.println(recTriangleNum(5));
//        System.out.println(recMultipy(3, 8));
        System.out.println(sumDigit(46723));
        System.out.println(recSumDigit(46723));
    }

    static int fact(int n) {
        int value = 1;
        for (int i = 1; i <= n; i++) {
            value *= i;
        }
        return value;
    }

    static int recFact(int n) {
        if (n <= 1) {
            return 1;
        }
        return recFact(n - 1) * n;
    }

    static long fibo(int n) {
        long a = 1;
        long b = 1;
        for (int i = 3; i <= n; i++) {
            b = b + a;
            a = b - a;
        }
        return b;
    }

    static long recFibo(int n) {
        System.out.print(n + " ");
        if (n < 3) {
            return 1;
        }
        return recFibo(n - 1) + recFibo(n - 2);
    }

    static int triangleNum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    static int recTriangleNum(int n) {
        if (n == 1) {
            return 1;
        }
        return recTriangleNum(n - 1) + n;
    }

    static int recMultipy(int a, int b) {
        if (b == 1) {
            return a;
        }
        return recMultipy(a, b - 1) + a;
    }

    static int sumDigit(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    static int recSumDigit(int n) {
        if (n < 10) {
            return n;
        }
        return recSumDigit(n / 10) + n % 10;
    }
}
