package ru.job4j.algos;

public class Recursion {
    public int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return factorial(n - 1) * n;
    }

    public int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    public int pow(int a, int n) {
        if (n == 0) {
            return 1;
        } else if (n % 2 == 0) {
            return pow(a * a, n / 2);
        } else {
            return pow(a, n - 1) * a;
        }
    }
}
