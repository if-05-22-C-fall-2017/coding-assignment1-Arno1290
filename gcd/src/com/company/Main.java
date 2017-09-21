package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args)
    {
        Random ran = new Random();

        int a = ran.nextInt(Integer.MAX_VALUE);
        int b = ran.nextInt(a);

        System.out.println("GCD of " + a + " and " + b + " is " + gcd_euclidian(a, b));
    }

    private static int gcd_prime_factors(int a, int b)
    {
        return 0;
    }

    private static int gcd_euclidian(int a, int b)
    {
        return b == 0 ? a : gcd_euclidian(b, a % b);
    }
}
